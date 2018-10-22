package com.whizlabs.spring.basics.bean.finetuning;

import com.whizlabs.spring.basics.bean.finetuning.data.Creature;
import com.whizlabs.spring.basics.bean.finetuning.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FineTuningApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FineTuningConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getFirst());
        System.out.println(person.getSecond());
        System.out.println(person.getThird());
        System.out.println(person.getForth());
        System.out.println(person.getNames());

        Creature creature = context.getBean(Creature.class);
        System.out.println(creature.getBird().move());
        System.out.println(creature.getCat().move());
        System.out.println(creature.getAnimals());
    }
}
