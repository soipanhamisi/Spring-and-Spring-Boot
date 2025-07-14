package org.soipan.repositories;

import org.soipan.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);

}
