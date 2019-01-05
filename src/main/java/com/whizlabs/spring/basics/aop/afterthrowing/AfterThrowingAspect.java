package com.whizlabs.spring.basics.aop.afterthrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {
    @AfterThrowing(pointcut = "execution(* throwException())", throwing = "exception")
    private void printMethodResult(JoinPoint joinPoint, Exception exception) {
        System.out.println("An exception was thrown by the method " + joinPoint.getSignature().getName());
        System.out.println("Message: " + exception.getMessage());
    }
}
