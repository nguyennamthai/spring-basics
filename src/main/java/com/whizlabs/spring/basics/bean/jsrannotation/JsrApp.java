package com.whizlabs.spring.basics.bean.jsrannotation;

import com.whizlabs.spring.basics.bean.jsrannotation.data.Location;
import com.whizlabs.spring.basics.bean.jsrannotation.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JsrApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JsrConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getIdentity().getFullName());
        Location location1 = person.getLocationProvider().get();
        Location location2 = person.getLocationProvider().get();
        System.out.println(location1 == location2);
    }
}
