package com.whizlabs.spring.basics.ioc.intro;

import com.whizlabs.spring.basics.ioc.intro.data.Person;

public class TraditionalApp {
    public static void main(String[] args) {
        Person person = new Person ("John Doe", "100 High Street");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
    }
}
