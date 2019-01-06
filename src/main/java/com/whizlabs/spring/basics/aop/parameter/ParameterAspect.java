package com.whizlabs.spring.basics.aop.parameter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ParameterAspect {
    @Pointcut("execution(* com.whizlabs.spring.basics.aop.parameter.Calculator.multiply(int))")
    private void multiplyPointcut() { }

    @Around(value = "multiplyPointcut() && args(arg) && target(cal)", argNames = "joinPoint,arg,cal")
    private int preHandle(ProceedingJoinPoint joinPoint, int arg, Calculator cal) throws Throwable {
        System.out.println("Pre-handing arguments for calculator with the factor of " + cal.getFactor());
        if (arg < 0) {
            arg = -arg;
        }
        Object result = joinPoint.proceed(new Object[]{arg});
        System.out.println("Calculation completed");
        return (int) result;
    }
}
