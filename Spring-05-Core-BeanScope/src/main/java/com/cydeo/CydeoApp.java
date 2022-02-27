package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("John");
        comment.setText("lkasds daskdlas dsalkd");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//
//
//        //before prototype - Singleton
//
////        System.out.println("cs1 = " + cs1); //cs1 = com.cydeo.service.CommentService@5876a9af
////
////        System.out.println("cs2 = " + cs2); ////cs2 = com.cydeo.service.CommentService@5876a9af
////
////        System.out.println("cs2==cs1 => " + (cs2==cs1)); //cs2==cs1 => true
//
//
//        //after scope prototype
//
//        System.out.println("cs1 = " + cs1); //cs1 = com.cydeo.service.CommentService@79e2c065af
//
//        System.out.println("cs2 = " + cs2); //cs2 = com.cydeo.service.CommentService@3a93b025
//
//        System.out.println("cs2==cs1 => " + (cs2==cs1)); //cs2==cs1 => false

        //Eager
// Eager ia printed
        //@Lazy added
        //nothing printed

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        //Lazy printed
    }

}
