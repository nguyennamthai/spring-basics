package com.whizlabs.spring.basics.ioc.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
    public static void main(String[] args) {
        ApplicationContext contextWithLiteMode = new AnnotationConfigApplicationContext(BeanLiteModeConfig.class);
        Name nameWithLiteMode = contextWithLiteMode.getBean(Name.class);
        Person personWithLiteMode = contextWithLiteMode.getBean(Person.class);
        System.out.println(nameWithLiteMode == personWithLiteMode.getName());

        ApplicationContext contextWithFullMode = new AnnotationConfigApplicationContext(BeanFullModeConfig.class);
        Name nameWithFullMode = contextWithFullMode.getBean(Name.class);
        Person personWithFullMode = contextWithFullMode.getBean(Person.class);
        System.out.println(nameWithFullMode == personWithFullMode.getName());
    }
}
