package com.cydeo.spring06springbootdemo.service;

import com.cydeo.spring06springbootdemo.model.Comment;
import com.cydeo.spring06springbootdemo.proxy.CommentNotificationProxy;
import com.cydeo.spring06springbootdemo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Scope ("prototype")
//@Scope (BeanDefinition.SCOPE_PROTOTYPE)

//@Lazy //Default is eager
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    
    @Value("value assigned to the variable")
    private String name;

    public CommentService(CommentRepository commentRepository,
//                          @Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
//        System.out.println("Eager");
        System.out.println("Lazy");
        System.out.println("name = " + name);
    }

    public  void publishComment (Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendcomment(comment);
    }

}
