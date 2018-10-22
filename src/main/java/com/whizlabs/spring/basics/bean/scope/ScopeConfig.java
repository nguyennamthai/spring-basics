package com.whizlabs.spring.basics.bean.scope;

import com.whizlabs.spring.basics.bean.scope.data.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan
public class ScopeConfig {
    @Bean
    @Scope("singleton")
    public Address getAddress(){
        return new Address("Los Angeles");
    }
}
