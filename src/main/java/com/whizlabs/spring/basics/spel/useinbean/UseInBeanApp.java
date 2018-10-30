package com.whizlabs.spring.basics.spel.useinbean;

import com.whizlabs.spring.basics.spel.useinbean.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UseInBeanApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UseInBeanConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}
