package com.whizlabs.spring.basics.aop.pointcut.data;

import com.whizlabs.spring.basics.aop.pointcut.service.LogService;

public class Person implements LogService {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void printFullName() {
        System.out.println("Full name: " + fullName);
    }

    public void log(String message) {
        System.out.println("Logged message: " + message);
    }
}
