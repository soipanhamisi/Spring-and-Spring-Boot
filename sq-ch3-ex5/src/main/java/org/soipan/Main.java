package org.soipan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var parrot = context.getBean("parrot1", Parrot.class);
        System.out.println(parrot.getName());
        System.out.println(parrot.getSound());
        var person = context.getBean(Person.class);
        System.out.println(person.getParrot().getName());
    }
}