package com.whizlabs.spring.basics.ioc.configuration;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;
import com.whizlabs.spring.basics.ioc.data.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFullModeConfig {
    @Bean
    public Name getName() {
        return new Name("John", "Doe");
    }

    @Bean
    public Address getAddress() {
        return new Address(100, "High Street");
    }

    @Bean
    public Person getPerson() {
        return new Person(getName(), getAddress());
    }
}
