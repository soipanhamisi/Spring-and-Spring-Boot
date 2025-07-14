package org.soipan.repository;

import org.soipan.model.Comment;

public interface CommentRepository {
    public void storeComment(Comment comment);
}
