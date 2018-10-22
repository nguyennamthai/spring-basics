package com.whizlabs.spring.basics.bean.profile.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class BeanE {
}
