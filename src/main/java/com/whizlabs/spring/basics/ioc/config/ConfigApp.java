package com.whizlabs.spring.basics.ioc.config;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;
import com.whizlabs.spring.basics.ioc.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanLiteModeConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());

        Name name = context.getBean(Name.class);
        Address address = context.getBean(Address.class);
        System.out.println(person.getName() == name);
        System.out.println(person.getAddress() == address);
    }
}
