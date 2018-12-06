package com.whizlabs.spring.basics.bean.callback;

import org.springframework.context.annotation.Bean;

public class CallbackConfig {
    @Bean(initMethod = "beanInit", destroyMethod = "beanDestroy")
    public DemoBean getPerson() {
        return new DemoBean();
    }
}
