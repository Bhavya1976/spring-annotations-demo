package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration

@PropertySource("classpath:values.property")

public class MovieConfiguration {
    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        return actor;
    }
    @Bean
    @Scope("prototype")

    public Movie movie(){
        Movie movie=new Movie(actor());

        return movie;
    }
    @Bean
    @Scope("prototype")

    public Movie movie(){
        Movie movie=new Movie(actor());

        return movie;
    }


}
