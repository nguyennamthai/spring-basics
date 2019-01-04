package com.whizlabs.spring.basics.aop.afterreturning;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGenerator {
    public Object generate() {
        return new Random().nextInt(100);
    }
}
