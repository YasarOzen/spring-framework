package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope ("prototype")
//@Scope (BeanDefinition.SCOPE_PROTOTYPE)

@Lazy //Default is eager
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
//                          @Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
//        System.out.println("Eager");
        System.out.println("Lazy");
    }

    public  void publishComment (Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendcomment(comment);
    }

}
