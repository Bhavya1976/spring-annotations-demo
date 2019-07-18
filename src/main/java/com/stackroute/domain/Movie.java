package com.stackroute.domain;




public class Movie {

    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display actor details using movie method
    public void movieDisplay(){

        actor.display();
    }



}
