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
public class Movie {
    //actor class instantiation
    @Autowired
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //display actor details using movie method
    public void moiveDisplay(){

        actor.display();
    }



}
