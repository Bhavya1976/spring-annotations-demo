package com.stackroute.domain;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:values.property")
@ComponentScan("com.stackroute")
public class MovieConfiguration {

    @Bean
    //@Scope("prototype")
    public Movie movie(){
        Movie movie=new Movie();

        return movie;
    }


}