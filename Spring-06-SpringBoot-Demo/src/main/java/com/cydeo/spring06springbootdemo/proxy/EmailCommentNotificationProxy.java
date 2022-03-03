package com.cydeo.spring06springbootdemo.proxy;


import com.cydeo.spring06springbootdemo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendcomment(Comment comment) {
        System.out.println("Sending :"+ comment.getText());
    }
}
