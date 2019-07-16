package com.stackroute;


import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfiguration.class);

        //for scope prototype
        Movie movie1=context.getBean( Movie.class);
        movie1.movieDisplay();

        Movie movie2=context.getBean(Movie.class);
        movie2.movieDisplay();

        System.out.println(movie1==movie2);









    }
}
