package com.whizlabs.spring.basics.aop.pointcut.data;

import com.whizlabs.spring.basics.aop.pointcut.LogService;

public class Person implements LogService {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void log(String message) {
        System.out.println("Logged message: " + message);
    }
}
