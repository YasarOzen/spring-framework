package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan (basePackages = "com.cydeo")
@ComponentScan (basePackages = {"com.cydeo.proxy", "com.cydeo.service", "com.cydeo.repository"})
//if any object has a dependency we need to inject from the contextt or if it is a dependency itself
public class ProjectConfig {
}
