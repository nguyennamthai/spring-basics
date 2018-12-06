package com.whizlabs.spring.basics.bean.profile;

import com.whizlabs.spring.basics.bean.profile.CustomProfile;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@CustomProfile
public class BeanD {
}
