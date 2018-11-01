package com.whizlabs.spring.basics.aop.around;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGenerator {
    public int generate() {
        return new Random().nextInt(100);
    }
}
