package org.soipan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.soipan")
public class Config {
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Blue");
        parrot.setSound("Squawk");
        return parrot;
    }
    @Bean
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Black");
        parrot.setSound("kook");
        return parrot;
    }
    @Bean
    public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Green");
        parrot.setSound("Kreek");
        return parrot;
    }

}
