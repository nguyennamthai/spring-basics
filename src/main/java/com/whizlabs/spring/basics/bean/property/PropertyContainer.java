package com.whizlabs.spring.basics.bean.property;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyContainer {
    private Environment environment;

    public PropertyContainer(Environment environment) {
        this.environment = environment;
    }

    public String getProperty() {
        return environment.getProperty("external-property");
    }
}
