package com.whizlabs.spring.basics.aop.afterreturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterReturningApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AfterReturningConfig.class);
        NumberGenerator generator = context.getBean(NumberGenerator.class);
        generator.generate();
    }
}
