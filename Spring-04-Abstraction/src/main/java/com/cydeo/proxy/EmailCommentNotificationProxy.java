package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendcomment(Comment comment) {
        System.out.println("Sending :"+ comment.getText());
    }
}
