package com.whizlabs.spring.basics.resource.injection;

import com.whizlabs.spring.basics.resource.injection.data.Mission;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@ComponentScan
public class InjectionApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectionApp.class);
        Mission mission = context.getBean(Mission.class);
        mission.printResourceContent();
    }
}
