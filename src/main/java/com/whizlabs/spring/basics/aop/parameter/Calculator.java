package com.whizlabs.spring.basics.aop.parameter;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private final int factor = 5;

    public int getFactor() {
        return factor;
    }

    public int multiply(int number) {
        return factor * number;
    }
}
