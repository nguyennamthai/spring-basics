package com.whizlabs.spring.basics.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutAspect {
    @Pointcut("execution(* print*())")
    private void noParamExecutionPointcut() {}

//    @Before("noParamExecutionPointcut()")
//    private void noParamExecutionAdvice() {
//        System.out.println("Printed by noParamExecutionAdvice");
//    }

    @Pointcut("execution(public void com.whizlabs..Person.*(*))")
    private void singleParamExecutionPointcut() {}

//    @Before("singleParamExecutionPointcut()")
//    private void singleParamExecutionAdvice() {
//        System.out.println("Printed by singleParamExecutionAdvice");
//    }

    @Before("noParamExecutionPointcut() && singleParamExecutionPointcut()")
    private void executionAdvice() {
        System.out.println("Printed by executionAdvice");
    }

    @Pointcut("within(com.whizlabs.spring.basics.aop.pointcut..*) && noParamExecutionPointcut()")
    private void withinPointcut() {}

    @Before("withinPointcut()")
    private void withinAdvice() {
        System.out.println("Printed by withinAdvice");
    }

    @Pointcut("target(com.whizlabs.spring.basics.aop.pointcut.service.LogService)")
    private void targetPointcut() {}

    @Before("targetPointcut() && execution(void log(..))")
    private void targetAdvice() {
        System.out.println("Printed by targetAdvice");
    }

    @Before("bean(getPerson) && execution(* printFullName())")
    private void beanAdvice() {
        System.out.println("Printed by beanAdvice");
    }
}
