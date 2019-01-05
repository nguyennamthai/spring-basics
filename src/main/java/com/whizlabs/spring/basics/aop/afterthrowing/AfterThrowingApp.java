package com.whizlabs.spring.basics.aop.afterthrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterThrowingApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AfterThrowingConfig.class);
        ExceptionThrower exceptionThrower = context.getBean(ExceptionThrower.class);
        exceptionThrower.throwException();
    }
}
