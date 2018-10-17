package com.whizlabs.spring.basics.ioc.bean;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean({"whizlabs", "nameBean"})
    public Name getName() {
        return new Name("John", "Doe");
    }

    @Bean
    public Address getAddress() {
        return new Address(100, "High Street");
    }
}
