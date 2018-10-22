package com.whizlabs.spring.basics.bean.autowiring.data;

import org.springframework.stereotype.Component;

@Component
public class Name {
    private String firstName;
    private String lastName;

    public Name() {
        this.firstName = "Rod";
        this.lastName = "Johnson";
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
