package com.whizlabs.spring.basics.aop.beforeandafter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class BeforeAndAfterConfig {
    @Bean
    public Person getPerson() {
        return new Person("John Doe");
    }
}
