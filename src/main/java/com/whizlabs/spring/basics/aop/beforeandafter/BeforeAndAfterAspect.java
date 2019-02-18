package com.whizlabs.spring.basics.aop.beforeandafter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAndAfterAspect {
    @Pointcut("within(com.whizlabs.spring.basics.aop.beforeandafter.Person)")
    private void withinPerson() {}

    @Before("withinPerson()")
    private void logBefore(JoinPoint joinPoint) {
        System.out.println("Executed BEFORE the " + joinPoint.getSignature().getName() + " method");
    }

    @After("withinPerson()")
    private void logAfter(JoinPoint joinPoint) {
        System.out.println("Executed AFTER the " + joinPoint.getSignature().getName() + " method");
    }
}
