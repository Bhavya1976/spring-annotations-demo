package com.stackroute.demo;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

    @Component
    public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
        @Override

        //To initialize the object Instance
        public void afterPropertiesSet() throws Exception {
            System.out.println("initialization");
            System.out.println();
        }

        @Override
        // Destroy method for Bean Destroy
        public void destroy() throws Exception {
            System.out.println("destroy");
        }

        //customInit method for Bean initializing

        public void customInit(){
            System.out.println("customInit");
        }

        // CustomDestroy method for customBeanDestroy
        public void customDestroy(){
            System.out.println("customDestroy");
        }
    }

