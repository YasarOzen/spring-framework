package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component @AllArgsConstructor //auto auto-wired by Spring
public class Java {

    //Field Injection
//    @Autowired // Field injection is not recommended
//    Officehours officehours;


    //Constructor injection
    Officehours officehours;

//    @Autowired //no need to add here, it auto-added
//    Lombok can be used
//    public Java(Officehours officehours) {
//        this.officehours = officehours;
//    }

    public void getTeachingHours() {
        System.out.println("Total teaching hours: "+ (200+ officehours.getOfficeHours()));
    }
}
