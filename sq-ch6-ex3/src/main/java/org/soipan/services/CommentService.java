package org.soipan.services;

import org.soipan.model.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getComment());
    }
    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.getComment());
    }
    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getComment());
    }
}
