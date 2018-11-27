package com.whizlabs.spring.basics.ioc.configuration;

import org.springframework.context.annotation.Bean;

public class BeanLiteModeConfig {
    @Bean
    public Name getName() {
        return new Name("John", "Doe");
    }

    @Bean
    public Person getPerson() {
        return new Person(getName());
    }
}
