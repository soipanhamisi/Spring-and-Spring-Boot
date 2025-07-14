package org.soipan;

import org.soipan.model.Comment;
import org.soipan.proxy.CommentNotificationProxy;
import org.soipan.proxy.EmailCommentNotificationProxy;
import org.soipan.repository.CommentRepository;
import org.soipan.repository.DBCommentRepository;
import org.soipan.services.CommentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("John Doe");
        comment.setComment("Good job guys");

        commentService.publishComment(comment);
    }
}