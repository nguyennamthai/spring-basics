package com.whizlabs.spring.basics.ioc.bean;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean({"address", "kingAvenue"})
    public Address getAddress() {
        return new Address(200, "King Avenue");
    }

    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setFullName("Jane Roe");
        person.setAddress(getAddress());
        return person;
    }
}
