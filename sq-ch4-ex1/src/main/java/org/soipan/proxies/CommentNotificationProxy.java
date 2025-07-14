package org.soipan.proxies;

import org.soipan.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
