package com.whizlabs.spring.basics.spel.beanspel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanSpELApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanSpELConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}
