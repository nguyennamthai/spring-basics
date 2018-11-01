package com.whizlabs.spring.basics.aop.concept;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConceptAspect {
    @Pointcut("execution(* print*(..))")
    private void printer() { }

    @Before("printer()")
    private void log() {
        System.out.println("Printed by an advice");
    }
}
