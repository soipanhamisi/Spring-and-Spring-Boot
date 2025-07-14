package org.soipan;

import org.soipan.services.CommentService;
import org.soipan.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        UserService userService = context.getBean(UserService.class);
        CommentService commentService = context.getBean(CommentService.class);

        System.out.println(
                "Are the userService and commentService CommentRepository the same: " +
                        (userService.getCommentRepository() == commentService.getCommentRepository()));
    }
}