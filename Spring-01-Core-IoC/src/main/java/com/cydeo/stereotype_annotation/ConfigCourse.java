package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//Recommendation: Component scan is preferred for owned beans, when not owned Bean annotations should be preferred
@ComponentScan (basePackages = "com.cydeo")
public class ConfigCourse {

}
