package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie.getActor());

        Movie movie1 = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1.getActor());

    }
}
