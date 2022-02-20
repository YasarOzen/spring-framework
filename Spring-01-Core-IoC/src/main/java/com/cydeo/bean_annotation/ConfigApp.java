package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  //STep 1 define a configuration class with annotation
public class ConfigApp {

    @Bean //Step 2 Annotation for beans
    FullTimeMentor fullTimeMentor () {
        return new FullTimeMentor();
    }


    //what if 2+ of a same kind, multtiple options
//    @Bean
//    PartTimeMentor partTimeMentor() {
//        return new PartTimeMentor();
//    }

//    @Bean (name = "p1")
        //naming to avoid org.springframework.beans.factory.NoUniqueBeanDefinitionException when there are multiple options
    @Primary @Bean //When multtiple options are present, preferable/default
    PartTimeMentor partTimeMentor() {
        return new PartTimeMentor();
    }

//    @Bean (name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2() {
        return new PartTimeMentor();
    }

}
