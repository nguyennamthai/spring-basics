package com.whizlabs.spring.basics.bean.finetuning.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Creature {
    private final Animal bird;
    private final Animal cat;
    private Map<String, Animal> animals;

    public Creature(Animal bird, Animal cat) {
        this.bird = bird;
        this.cat = cat;
    }

    public Animal getBird() {
        return bird;
    }

    public Animal getCat() {
        return cat;
    }

    public Map<String, Animal> getAnimals() {
        return animals;
    }

    @Autowired
    public void setAnimals(Map<String, Animal> animals) {
        this.animals = animals;
    }
}
