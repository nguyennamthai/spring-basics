package com.whizlabs.spring.basics.bean.autowiring;

import com.whizlabs.spring.basics.bean.autowiring.data.Company;
import com.whizlabs.spring.basics.bean.autowiring.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AutowiringConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAddress());

        Company company = context.getBean(Company.class);
        System.out.println(company.getCeo() == person);
        System.out.println(company.getRevenue());
    }
}
