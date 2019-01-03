package com.whizlabs.spring.basics.aop.beforeandafter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeforeAndAfterApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeforeAndAfterConfig.class);
        Person person = context.getBean(Person.class);
        person.printFullName();
        person.throwException();
    }
}
