package com.whizlabs.spring.basics.bean.finetuning.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements Animal {
    @Override
    public String move() {
        return "Jump";
    }

    @Override
    public String toString() {
        return move();
    }
}
