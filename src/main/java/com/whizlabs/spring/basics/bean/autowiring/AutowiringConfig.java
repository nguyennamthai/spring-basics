package com.whizlabs.spring.basics.bean.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("bean/person.properties")
public class AutowiringConfig {
    @Bean
    public Name getName() {
        return new Name("Rod", "Johnson");
    }

    @Bean
    public Address getAddress() {
        return new Address(100, "High Street");
    }

    @Bean
    public Person getPerson() {
        return new Person(getName());
    }
}
