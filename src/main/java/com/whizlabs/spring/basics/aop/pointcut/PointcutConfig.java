package com.whizlabs.spring.basics.aop.pointcut;

import com.whizlabs.spring.basics.aop.pointcut.data.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class PointcutConfig {
    @Bean
    public Person getPerson() {
        return new Person("John Doe");
    }
}
