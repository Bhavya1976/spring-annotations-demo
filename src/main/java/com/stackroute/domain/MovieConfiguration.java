package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration

@PropertySource("classpath:values.property")

public class MovieConfiguration {

    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }

    @Bean
    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }


}
