package com.whizlabs.spring.basics.bean.profile.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"qa", "prod"})
public class BeanC {
}
