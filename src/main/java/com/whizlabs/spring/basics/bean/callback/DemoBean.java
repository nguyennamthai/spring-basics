package com.whizlabs.spring.basics.bean.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoBean implements InitializingBean, DisposableBean {
    public void beanInit() {
        System.out.println("initMethod specified in @Bean");
    }

    public void afterPropertiesSet() {
        System.out.println( "afterPropertiesSet method of InitializingBean");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("method annotated with @PostConstruct");
    }

    public void beanDestroy() {
        System.out.println("destroyMethod specified in @Bean");
    }

    public void destroy() {
        System.out.println("destroy method of DisposableBean");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("method annotated with @PreDestroy");
    }
}
