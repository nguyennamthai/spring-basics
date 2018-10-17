package com.whizlabs.spring.basics.ioc.intro;

import com.whizlabs.spring.basics.ioc.intro.data.Person;
import org.springframework.context.annotation.Bean;

public class IntroConfig {
    @Bean
    public Person getPerson() {
        return new Person("Jane Roe", "200 Fountain Road");
    }
}
