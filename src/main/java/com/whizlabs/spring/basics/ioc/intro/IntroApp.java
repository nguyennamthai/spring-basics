package com.whizlabs.spring.basics.ioc.intro;

import com.whizlabs.spring.basics.ioc.intro.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IntroConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}

