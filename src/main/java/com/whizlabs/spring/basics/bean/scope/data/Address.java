package com.whizlabs.spring.basics.bean.scope.data;

public class Address {
    private String location;

    public Address(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
