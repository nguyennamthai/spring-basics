package com.whizlabs.spring.basics.aop.concept;

import com.whizlabs.spring.basics.aop.concept.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConceptApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConceptConfig.class);
        Person person = context.getBean(Person.class);
        person.printOperation();
        person.printFullName();
        System.out.println(person.getClass().getSimpleName());
    }
}
