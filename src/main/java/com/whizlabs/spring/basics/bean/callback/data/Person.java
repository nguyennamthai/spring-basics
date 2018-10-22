package com.whizlabs.spring.basics.bean.callback.data;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person implements InitializingBean, DisposableBean {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void beanInit() {
        System.out.println(fullName + " - printed from init method specified in @Bean");
    }

    public void afterPropertiesSet() {
        System.out.println(fullName + " -  printed from init method specified in InitializingBean");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(fullName + " - printed from init method specified in @PostConstruct");
    }

    public void beanDestroy() {
        System.out.println("Printed from destroy method specified in @Bean");
    }

    public void destroy() {
        System.out.println("Printed from destroy method specified in DisposableBean");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Printed from destroy method specified in @PreDestroy");
    }
}
