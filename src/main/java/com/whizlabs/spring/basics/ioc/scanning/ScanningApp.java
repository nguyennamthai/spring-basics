package com.whizlabs.spring.basics.ioc.scanning;

import com.whizlabs.spring.basics.ioc.scanning.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanningApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScanningConfig.class);
        Person person1 = context.getBean("person", Person.class);
        person1.setName("Jane Roe");
        Person person2 = context.getBean(Person.class);
        System.out.println(person2.getName());
    }
}
