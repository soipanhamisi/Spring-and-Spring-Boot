package org.soipan;

import org.soipan.model.Comment;
import org.soipan.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("John");
        comment.setComment("Good job guys...");
        context.getBean(CommentService.class).publishComment(comment);

    }
}