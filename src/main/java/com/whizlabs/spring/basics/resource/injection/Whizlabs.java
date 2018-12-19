package com.whizlabs.spring.basics.resource.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

@Component
public class Whizlabs {
    private Resource resource;

    public Whizlabs(@Value("https://www.whizlabs.com/about-us") Resource resource) {
        this.resource = resource;
    }

    public void printResourceContent() throws IOException {
        Scanner scanner = new Scanner(resource.getInputStream());
        while (scanner.hasNext()) {
            if (scanner.nextLine().equals("<h2>OUR MISSION</h2>")) {
                System.out.println(scanner.nextLine());
            }
        }
        scanner.close();
    }
}
