package com.whizlabs.spring.basics.spel.beanspel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    @Value("#{'${first-name}' + ' ' + '${last-name}'}")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    @Value("#{T(java.time.Year).now().value - T(Integer).parseInt('${year-of-birth}')}")
    public void setAge(int age) {
        this.age = age;
    }
}
