package com.whizlabs.spring.basics.bean.profile;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Profile("(dev & qa) | prod")
public @interface CustomProfile {
}
