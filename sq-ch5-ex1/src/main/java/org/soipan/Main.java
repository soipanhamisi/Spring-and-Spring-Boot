package org.soipan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var hello1 = context.getBean("hello1", HelloWorld.class);
        var hello2 = context.getBean("hello1" , HelloWorld.class);

        boolean output = hello1.equals(hello2);
        System.out.println("hello1 == hello2: " + output);
    }
}