package org.soipan.proxy;

import org.soipan.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment sent by email");
    }
}
