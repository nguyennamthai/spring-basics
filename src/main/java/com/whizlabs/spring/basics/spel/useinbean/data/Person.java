package com.whizlabs.spring.basics.spel.useinbean.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    @Autowired
    public void setFullName(@Value("#{'${firstName}' + ' ' + '${lastName}'}") String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    @Autowired
    @Value("#{T(java.time.Year).now().value - T(Integer).parseInt('${yearOfBirth}')}")
    public void setAge(int age) {
        this.age = age;
    }
}
