package com.whizlabs.spring.basics.resource.injection.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;

@Component
public class Mission {
    private Resource resource;

    public Mission(@Value("resource/whizlabs-mission.txt") Resource resource) {
        this.resource = resource;
    }

    public void printResourceContent() throws IOException {
        Files.lines(resource.getFile().toPath()).forEach(System.out::println);
    }
}
