package com.stackroute.domain;


public class Movie {


    private Actor actor;


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieDisplay(){
        //System.out.println("display using movie class");
        actor.display();
    }



}