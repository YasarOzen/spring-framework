package com.cydeo.spring06springbootdemo.repository;

import com.cydeo.spring06springbootdemo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing "+comment.getText());
    }
}
