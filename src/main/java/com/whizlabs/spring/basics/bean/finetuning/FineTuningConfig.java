package com.whizlabs.spring.basics.bean.finetuning;

import com.whizlabs.spring.basics.bean.finetuning.data.Name;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan
public class FineTuningConfig {
    @Bean
    @Primary
    public Name first() {
        return new Name("Donald");
    }

    @Bean
    @Qualifier("renegade")
    public Name second() {
        return new Name("Barack");
    }

    @Bean
    @Trailblazer
    public Name third() {
        return new Name("George");
    }

    @Bean("eagle")
    public Name forth() {
        return new Name("Bill");
    }
}
