package com.whizlabs.spring.basics.bean.ditype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DITypeConfig {
    @Bean
    public Name getName() {
        return new Name("Rod", "Johnson");
    }

    @Bean
    public Address getAddress() {
        return new Address("Pennsylvania Avenue");
    }

    @Bean
    public Occupation getOccupation() {
        return new Occupation("Java Developer");
    }
}
