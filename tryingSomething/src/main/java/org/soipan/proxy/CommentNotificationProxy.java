package org.soipan.proxy;

import org.soipan.model.Comment;

public interface CommentNotificationProxy {
    public void sendComment(Comment comment);
}
