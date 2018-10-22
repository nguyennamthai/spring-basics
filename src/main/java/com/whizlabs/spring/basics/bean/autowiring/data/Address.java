package com.whizlabs.spring.basics.bean.autowiring.data;

import org.springframework.stereotype.Component;

@Component
public class Address implements Location {
    private int number;
    private String street;

    public Address() {
        this.number = 100;
        this.street = "High Street";
    }

    public String toString() {
        return number + " " + street;
    }
}
