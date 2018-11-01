package com.whizlabs.spring.basics.aop.parameter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ParameterAspect {
    @Pointcut("execution(* com.whizlabs.spring.basics.aop.parameter.Calculator.multiply(int, int, ..))")
    private void multiplyPointcut() { }

    @Around("multiplyPointcut() && args(arg1, arg2, ..)")
    private int preHandle(ProceedingJoinPoint joinPoint, int arg1, int arg2) throws Throwable {
        System.out.println("Pre-handing arguments ...");
        if (arg1 < 0) {
            arg1 = -arg1;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        Object result = joinPoint.proceed(new Object[]{arg1, arg2});
        System.out.println("Calculation completed");
        return (int) result;
    }
}
