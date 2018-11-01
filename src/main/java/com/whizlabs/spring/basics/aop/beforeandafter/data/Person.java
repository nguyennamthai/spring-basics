package com.whizlabs.spring.basics.aop.beforeandafter.data;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void throwException() {
        throw new RuntimeException("Test exception");
    }
}
