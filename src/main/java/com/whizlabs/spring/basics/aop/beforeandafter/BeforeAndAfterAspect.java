package com.whizlabs.spring.basics.aop.beforeandafter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAndAfterAspect {
    @Before("execution(* *..Person.*(..))")
    private void logBefore(JoinPoint joinPoint) {
        System.out.println("Executed before the " + joinPoint.getSignature().getName() + " method");
    }

    @After("execution(* *..Person.*(..))")
    private void logAfter(JoinPoint joinPoint) {
        System.out.println("Executed after the " + joinPoint.getSignature().getName() + " method");
    }
}
