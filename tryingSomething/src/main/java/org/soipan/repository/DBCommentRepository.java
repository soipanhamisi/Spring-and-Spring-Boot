package org.soipan.repository;

import org.soipan.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Comment stored in DB as: \n" +
                "name: " +
                comment.getAuthor() + "\n" +
                "content: " +
                comment.getComment());
    }
}
