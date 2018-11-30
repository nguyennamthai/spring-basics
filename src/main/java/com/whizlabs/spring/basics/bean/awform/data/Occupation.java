package com.whizlabs.spring.basics.bean.awform.data;

import org.springframework.stereotype.Component;

@Component
public class Occupation {
    private String ranking;
    private String role;

    public Occupation() {
        this.ranking = "Junior";
        this.role = "Developer";
    }

    @Override
    public String toString() {
        return ranking + " " + role;
    }
}
