package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[]args) throws Exception {


        //invoking the objects
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MovieConfiguration.class);
        BeanLifeCycleDemoBean beanLifecycleDemoBean =context.getBean( BeanLifeCycleDemoBean.class);
        context.close();


    }
}