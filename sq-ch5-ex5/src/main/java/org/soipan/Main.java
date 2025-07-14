package org.soipan;

import org.soipan.services.CommentService;
import org.soipan.services.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var b1 = contex.getBean("commentService1", CommentService.class);
        var b2 = contex.getBean("commentService1", CommentService.class);

        System.out.println("the two beans are the same: " + (b1 == b2));
    }
}