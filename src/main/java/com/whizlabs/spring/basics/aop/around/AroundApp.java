package com.whizlabs.spring.basics.aop.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AroundConfig.class);
        NumberGenerator generator = context.getBean(NumberGenerator.class);
        int generatedNumber = generator.generate();
        System.out.println("Generated number: " + generatedNumber);
    }
}
