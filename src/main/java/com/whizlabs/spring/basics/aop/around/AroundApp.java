package com.whizlabs.spring.basics.aop.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AroundConfig.class);
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
        int generatedNumber = numberGenerator.generate();
        System.out.println("Generated number: " + generatedNumber);
    }
}
