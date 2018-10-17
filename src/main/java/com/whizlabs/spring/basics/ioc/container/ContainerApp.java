package com.whizlabs.spring.basics.ioc.container;

import com.whizlabs.spring.basics.ioc.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/basic-config.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
