package com.whizlabs.spring.basics.bean.profile;

import com.whizlabs.spring.basics.bean.profile.data.BeanA;
import com.whizlabs.spring.basics.bean.profile.data.BeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@ComponentScan
public class ProfileConfig {
    @Bean("beanA")
    public BeanA getBeanA() {
        return new BeanA();
    }

    @Bean("beanB")
    @Profile("dev")
    public BeanB getBeanB() {
        return new BeanB();
    }
}
