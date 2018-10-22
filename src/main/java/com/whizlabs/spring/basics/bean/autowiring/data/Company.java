package com.whizlabs.spring.basics.bean.autowiring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Company {
    private Person ceo;
    private String revenue;

    public Person getCeo() {
        return ceo;
    }

    public void setCeo(Person ceo) {
        this.ceo = ceo;
    }

    public String getRevenue() {
        return revenue;
    }

    @Autowired
    public void setRevenue(Environment environment) {
        this.revenue = environment.getProperty("revenue");
    }
}
