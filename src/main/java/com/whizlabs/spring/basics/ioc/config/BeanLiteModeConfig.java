package com.whizlabs.spring.basics.ioc.config;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;
import com.whizlabs.spring.basics.ioc.data.Person;
import org.springframework.context.annotation.Bean;

public class BeanLiteModeConfig {
    @Bean
    public final Name getName() {
        return new Name("John", "Doe");
    }

    @Bean
    public final Address getAddress() {
        return new Address(100, "High Street");
    }

    @Bean
    public final Person getPerson() {
        return new Person(getName(), getAddress());
    }
}
