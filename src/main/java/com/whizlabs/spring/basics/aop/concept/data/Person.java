package com.whizlabs.spring.basics.aop.concept.data;

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

    public void printOperation() {
        System.out.println("An operation is under way");
    }
}
