package com.whizlabs.spring.basics.ioc.data;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;

public class Person {
    private Name name;
    private Address address;

    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
