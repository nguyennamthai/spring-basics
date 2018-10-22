package com.whizlabs.spring.basics.bean.divariant;

import com.whizlabs.spring.basics.bean.divariant.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DIVariantApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DIVariantApp.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println(person.getOccupation());
    }
}
