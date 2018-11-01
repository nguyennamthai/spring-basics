package com.whizlabs.spring.basics.aop.beforeandafter;

import com.whizlabs.spring.basics.aop.beforeandafter.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeforeAndAfterApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeforeAndAfterConfig.class);
        Person person = context.getBean(Person.class);
        person.printFullName();
        try {
            person.throwException();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
