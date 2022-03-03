package com.cydeo.spring06springbootdemo.repository;

import com.cydeo.spring06springbootdemo.model.Comment;

public interface CommentRepository {
    void storeComment (Comment comment);
}
