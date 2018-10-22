package com.whizlabs.spring.basics.bean.jsrannotation;

import com.whizlabs.spring.basics.bean.jsrannotation.data.Identity;
import com.whizlabs.spring.basics.bean.jsrannotation.data.Location;
import com.whizlabs.spring.basics.bean.jsrannotation.data.Occupation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@ComponentScan
public class JsrConfig {
    @Bean("identity")
    public Identity getIdentity() {
        return new Identity("Larry Ellison");
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Location getLocation() {
        return new Location("10 Downing Street");
    }

    @Bean
    public Occupation getOccupation() {
        return new Occupation("Developer");
    }
}
