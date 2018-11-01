package com.whizlabs.spring.basics.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {
    @Pointcut("execution(* *(String))")
    private void personExecutionPointcut() { }

    @Pointcut("execution(public * com.whizlabs..Person.*())")
    private void publicExecutionPointcut() { }

    @Before("personExecutionPointcut() || publicExecutionPointcut()")
    private void executionAdvice() {
        System.out.println("Printed by executionAdvice");
    }

    @Pointcut("target(LogService)")
    private void targetPointcut() { }

    @Before("targetPointcut() && execution(void log(..))")
    private void targetAdvice() {
        System.out.println("Printed by targetAdvice");
    }
}
