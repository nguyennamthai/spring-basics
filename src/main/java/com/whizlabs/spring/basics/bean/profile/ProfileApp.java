package com.whizlabs.spring.basics.bean.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ProfileApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev", "qa");
        context.register(ProfileConfig.class);
        context.refresh();
        Arrays.stream(context.getBeanDefinitionNames())
                .filter(beanName -> beanName.startsWith("bean"))
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
