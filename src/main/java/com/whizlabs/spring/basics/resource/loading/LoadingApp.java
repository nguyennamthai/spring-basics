package com.whizlabs.spring.basics.resource.loading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;

public class LoadingApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(LoadingApp.class);
        Resource resource = context.getResource("resource/whizlabs-mission.txt");
        Files.lines(resource.getFile().toPath()).forEach(System.out::println);
    }
}
