package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;



public class Actor {
    @Value("${actor.Name}")
    private String name;
    @Value("${actor.Gender}")
    private String gender;
    @Value("${actor.Age}")
    private int age;


    public void display(){
        System.out.println("name\t"+name+"\tgender\t"+gender+"\tage\t"+age);
    }


}
