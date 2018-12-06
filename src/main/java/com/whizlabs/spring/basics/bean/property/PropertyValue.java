package com.whizlabs.spring.basics.bean.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyValue {
    private String external;

    public PropertyValue(@Value("${external-property}") String external) {
        this.external = external;
    }

    public String getProperty() {
        return external;
    }
}
