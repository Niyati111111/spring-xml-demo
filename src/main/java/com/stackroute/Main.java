package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("MovieA",Movie.class);
        Movie newMovie = applicationContext.getBean("MovieB",Movie.class);
        System.out.println(movie.getActor());

        Movie movie1 = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie1.getActor());

        Movie movie2 = applicationContext.getBean("movie2",Movie.class);
        System.out.println(movie2.getActor());

        System.out.println(movie == newMovie); //since they are referencing the same bean and their prototype is singleton, they are equal
        //if we change the scope of movie bean to prototype, then this will print false
    }
}
