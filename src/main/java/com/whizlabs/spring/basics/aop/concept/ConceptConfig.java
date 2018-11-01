package com.whizlabs.spring.basics.aop.concept;

import com.whizlabs.spring.basics.aop.concept.data.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
public class ConceptConfig {
    @Bean
    public Person getPerson() {
        return new Person("John", "Doe");
    }
}
