package com.whizlabs.spring.basics.aop.afterthrowing;

import org.springframework.stereotype.Component;

@Component
public class ExceptionThrower {
    public void throwException() {
        throw new RuntimeException("Test exception");
    }
}
