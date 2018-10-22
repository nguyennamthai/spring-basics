package com.whizlabs.spring.basics.bean.divariant.data;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int number;
    private String street;

    public Address() {
        this.number = 1600;
        this.street = "Pennsylvania Avenue";
    }

    public String toString() {
        return number + " " + street;
    }
}
