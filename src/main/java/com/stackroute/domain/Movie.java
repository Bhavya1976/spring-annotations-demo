package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware,BeanFactoryAware,BeanNameAware{

    @Autowired
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //Display function for the movie class
    public void movieDisplay(){

        actor.display();
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      // getting the object  of Movie class from IoC as 'movie'
        Movie movie=applicationContext.getBean(Movie.class);
        movie.movieDisplay();   //displaying the details

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);    //print statement for the beanFactory
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);   // print statement for the beanName
    }
}