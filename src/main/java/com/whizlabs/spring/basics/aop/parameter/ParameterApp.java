package com.whizlabs.spring.basics.aop.parameter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParameterApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ParameterConfig.class);
        Calculator calculator = context.getBean(Calculator.class);
        System.out.printf("The result is %s", calculator.multiply(-2, 3));
    }
}
