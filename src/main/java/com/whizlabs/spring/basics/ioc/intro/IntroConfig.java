package com.whizlabs.spring.basics.ioc.intro;

import org.springframework.context.annotation.Bean;

public class IntroConfig {
    @Bean
    public Person getPerson() {
        return new Person("Jane Roe");
    }
}
