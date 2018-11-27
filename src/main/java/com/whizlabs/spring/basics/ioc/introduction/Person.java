package com.whizlabs.spring.basics.ioc.introduction;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
