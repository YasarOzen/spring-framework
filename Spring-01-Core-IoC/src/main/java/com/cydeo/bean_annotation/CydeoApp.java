package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        //Step 3 all config goes into container

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();
        
        String st = container.getBean(String.class);
        System.out.println("st = " + st);

//        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
//        pt.createAccount(); //Duplication
        /*
        Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        No qualifying bean of type 'com.cydeo.bean_annotation.PartTimeMentor'
             ------available: expected single matching bean
             ------but found 2: partTimeMentor,partTimeMentor2
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1271)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:494)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:349)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1172)
	at com.cydeo.bean_annotation.CydeoApp.main(CydeoApp.java:18)
         */

        PartTimeMentor pt = container.getBean("p1", PartTimeMentor.class); //naming avoids above exception
        pt.createAccount(); //Duplication

    }

}
