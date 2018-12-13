package com.whizlabs.spring.basics.bean.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet method of InitializingBean");
    }

    @Override
    public void destroy() {
        System.out.println("destroy method of DisposableBean");
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("method annotated with @PostConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("method annotated with @PreDestroy");
    }

    private void beanInit() {
        System.out.println("initMethod specified in @Bean");
    }

    private void beanDestroy() {
        System.out.println("destroyMethod specified in @Bean");
    }
}
