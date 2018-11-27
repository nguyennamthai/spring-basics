package com.whizlabs.spring.basics.ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        ApplicationContext contextWithXMLConfig = new ClassPathXmlApplicationContext("ioc/basic-config.xml");
        Person john = (Person) contextWithXMLConfig.getBean("person");
        System.out.println(john.getFullName());
        System.out.println(john.getAddress());

        ApplicationContext contextWithJavaConfig = new AnnotationConfigApplicationContext(BeanConfig.class);
        Address address1 = (Address) contextWithJavaConfig.getBean("address");
        Address address2 = contextWithJavaConfig.getBean("kingAvenue", Address.class);
        System.out.println(address1 == address2);
        Person jane = contextWithJavaConfig.getBean(Person.class);
        System.out.println(jane.getFullName());
        System.out.println(jane.getAddress());
    }
}
