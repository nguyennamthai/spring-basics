package com.whizlabs.spring.basics.bean.property;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("bean/property-app.properties")
class PropertyConfig {
}