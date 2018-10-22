package com.whizlabs.spring.basics.bean.finetuning.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bird")
public class Bird implements Animal {
    public String move() {
        return "Fly";
    }

    @Override
    public String toString() {
        return move();
    }
}
