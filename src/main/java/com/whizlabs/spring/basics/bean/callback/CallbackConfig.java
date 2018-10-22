package com.whizlabs.spring.basics.bean.callback;

import com.whizlabs.spring.basics.bean.callback.data.Person;
import org.springframework.context.annotation.Bean;

public class CallbackConfig {
    @Bean(initMethod = "beanInit", destroyMethod = "beanDestroy")
    public Person getPerson() {
        return new Person("James Gosling");
    }
}
