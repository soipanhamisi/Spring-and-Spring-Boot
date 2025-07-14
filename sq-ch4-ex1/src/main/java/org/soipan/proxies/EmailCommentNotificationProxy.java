package org.soipan.proxies;

import org.soipan.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for:\n " +
                "Author: "+comment.getAuthor()+
                "\n"+ comment.getComment());
    }
}
