package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Actor {

    @Value("${actor.Name}")
    private String name;

    @Value("${actor.Gender}")
    private String gender;

    @Value("${actor.Age}")
    private int age;

    public Actor(){}

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public void display(){
        System.out.println("NAME\t"+name+"\tGENDER\t"+gender+"\tAGE\t"+age);
    }


}
