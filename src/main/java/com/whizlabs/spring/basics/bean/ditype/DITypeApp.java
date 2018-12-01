package com.whizlabs.spring.basics.bean.ditype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class DITypeApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DITypeConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress().getStreet());
        System.out.println(person.getOccupation().getJobTitle());
    }
}
