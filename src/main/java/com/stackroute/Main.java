package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = applicationContext.getBean("movie",Movie.class);
        System.out.println(movie.getActor());

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = factory.getBean("movie1",Movie.class);
        System.out.println(movie1.getActor());

    }
}
