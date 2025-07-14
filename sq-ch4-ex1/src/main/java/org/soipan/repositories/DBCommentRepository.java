package org.soipan.repositories;

import org.soipan.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in DB:" + comment.getComment());
    }
}
