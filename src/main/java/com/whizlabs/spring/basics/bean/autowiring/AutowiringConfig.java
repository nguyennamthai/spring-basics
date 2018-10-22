package com.whizlabs.spring.basics.bean.autowiring;

import com.whizlabs.spring.basics.bean.autowiring.data.Company;
import com.whizlabs.spring.basics.bean.autowiring.data.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("bean/company.properties")
public class AutowiringConfig {
    @Bean
    public Company getCompany(Person person) {
        Company company = new Company();
        company.setCeo(person);
        return company;
    }
}
