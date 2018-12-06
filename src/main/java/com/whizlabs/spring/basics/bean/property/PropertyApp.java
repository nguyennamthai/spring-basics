package com.whizlabs.spring.basics.bean.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

public class PropertyApp {
    public static void main(String[] args) {
        ApplicationContext genericApplicationContext = new GenericApplicationContext();
        Environment environment = genericApplicationContext.getEnvironment();
        boolean hasMyProperty = environment.containsProperty("my-property");
        String myPropValue = environment.getProperty("my-property");
        System.out.println("my-property exists: " + hasMyProperty + " - " + "the value is " + myPropValue);
        boolean hasNoProperty = environment.containsProperty("no-property");
        String noPropValue = environment.getProperty("no-property", "default value");
        System.out.println("no-property exists: " + hasNoProperty + " - " + "the value is " + noPropValue);

        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(PropertyConfig.class);
        PropertyContainer propertyContainer = configApplicationContext.getBean(PropertyContainer.class);
        System.out.println(propertyContainer.getProperty());
        PropertyValue propertyValue = configApplicationContext.getBean(PropertyValue.class);
        System.out.println(propertyValue.getProperty());
    }
}
