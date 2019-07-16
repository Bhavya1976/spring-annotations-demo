package com.stackroute;



import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {



        public static void main(String[]args) {
           

            ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfiguration.class);
            Movie moive1=context.getBean( Movie.class);
            moive1.movieDisplay();







        }
    }


