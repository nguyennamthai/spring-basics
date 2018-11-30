package com.whizlabs.spring.basics.bean.awform.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Name name;
    private Address address;
    @Autowired
    private Occupation occupation;

    @Autowired
    public Person(Name name) {
        this.name = name;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
