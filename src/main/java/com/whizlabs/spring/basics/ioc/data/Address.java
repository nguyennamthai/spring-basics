package com.whizlabs.spring.basics.ioc.data;

public class Address {
    private int number;
    private String street;

    public Address(int number, String street) {
        this.number = number;
        this.street = street;
    }

    public String toString() {
        return number + " " + street;
    }
}
