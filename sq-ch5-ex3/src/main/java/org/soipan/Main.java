package org.soipan;

import org.soipan.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("before referring to the bean in context...");
        var commentService = context.getBean(CommentService.class);
        System.out.println("after referring to the bean in context...");
    }
}