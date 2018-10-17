package com.whizlabs.spring.basics.ioc.bean;

import com.whizlabs.spring.basics.ioc.data.Address;
import com.whizlabs.spring.basics.ioc.data.Name;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Name name1 = context.getBean("whizlabs", Name.class);
        Name name2 = context.getBean("nameBean", Name.class);
        System.out.println(name1 == name2);
        System.out.println(name1);
        Address address = context.getBean("getAddress", Address.class);
        System.out.println(address);
    }
}
