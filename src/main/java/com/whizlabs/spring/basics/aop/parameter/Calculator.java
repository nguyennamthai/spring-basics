package com.whizlabs.spring.basics.aop.parameter;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
