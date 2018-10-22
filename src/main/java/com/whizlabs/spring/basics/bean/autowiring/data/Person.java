package com.whizlabs.spring.basics.bean.autowiring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Name name;
    private Address address;

    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void arbitraryName(Address address) {
        this.address = address;
    }
}
