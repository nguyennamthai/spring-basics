package com.whizlabs.spring.basics.bean.jeeannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class JsrConfig {
    @Bean
    public Identity getIdentity() {
        return new Identity("John Doe");
    }

    @Bean
    public Location getLocation() {
        return new Location("White House");
    }
}
