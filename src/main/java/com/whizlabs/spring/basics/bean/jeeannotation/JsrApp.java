package com.whizlabs.spring.basics.bean.jeeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JsrApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JsrConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getIdentity().getFullName());
        System.out.println(person.getLocation().getAddress());
    }
}
