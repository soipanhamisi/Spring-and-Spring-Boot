package org.soipan.proxies;

import org.soipan.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Comment push notification\n" +
                comment.getAuthor() + "\n commented: " + comment.getComment());
    }
}
