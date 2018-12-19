package com.whizlabs.spring.basics.resource.loading;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;

@Component
public class Whizlabs {
    private final ResourceLoader resourceLoader;

    public Whizlabs(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void getResourceFromClassPath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:resource/mission.txt");
        Files.lines(resource.getFile().toPath()).forEach(System.out::println);
    }

    public void getResourceFromFileSystem() throws IOException {
        Resource resource = resourceLoader.getResource("file:resource/mission.txt");
        Files.lines(resource.getFile().toPath()).forEach(System.out::println);
    }
}
