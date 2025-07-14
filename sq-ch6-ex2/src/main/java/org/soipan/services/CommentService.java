package org.soipan.services;

import org.soipan.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public String PublishComment(Comment comment){
        System.out.println("Published comment:" + comment.getComment());
        return "SUCCESS";
    }
}
