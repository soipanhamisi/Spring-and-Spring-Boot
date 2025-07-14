package org.soipan.services;

import org.soipan.advices.ToLog;
import org.soipan.model.Comment;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommentService {
    @ToLog
    public String publishComment(Comment comment) {
        System.out.println("Published comment: " + comment.getComment());
        return "SUCCESS";
    }
}
