package com.whizlabs.spring.basics.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {
    @Around("execution(int generate())")
    private int printExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object result = joinPoint.proceed();
        long end = System.nanoTime();
        System.out.printf("Execution time: %.2f milliseconds%n", (end - start) / 10E6);
        return (int) result;
    }
}
