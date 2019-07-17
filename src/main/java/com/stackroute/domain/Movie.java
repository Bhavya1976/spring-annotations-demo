package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware,BeanFactoryAware,BeanNameAware{
    //actor class instantiation
    @Autowired
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieDisplay(){

        actor.display();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext)  {

        Movie movie=applicationContext.getBean(Movie.class);
        movie.movieDisplay();

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory)  {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);
    }
}