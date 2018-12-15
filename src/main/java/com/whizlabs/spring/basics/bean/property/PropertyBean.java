package com.whizlabs.spring.basics.bean.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyBean {
    private Environment environment;
    private String provider;

    public PropertyBean(Environment environment) {
        this.environment = environment;
    }

    public String getCourse() {
        return environment.getProperty("course");
    }

    public String getProvider() {
        return provider;
    }

    @Value("${provider}")
    public void setProvider(String provider) {
        this.provider = provider;
    }
}
