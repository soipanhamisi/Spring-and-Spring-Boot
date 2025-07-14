package org.soipan.services;

import org.soipan.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    public void publishComment(Comment comment){
        System.out.println( "Publishing comment: " + comment.getComment());
    }
}
