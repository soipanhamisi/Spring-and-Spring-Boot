package org.soipan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Blue Parrot");
        parrot.setSound("Squawk");
        return parrot;
    }
    @Bean
    Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("purple Parrot");
        parrot.setSound("kookoo");
        return parrot;
    }
    @Bean
    Parrot parrot3(){
        Parrot parrot = new Parrot();
        parrot.setName("green Parrot");
        parrot.setSound("screeech");
        return parrot;
    }
    @Bean
    Person person(
            @Qualifier("parrot2") Parrot parrot
    ){
        Person person = new Person();
        person.setParrot(parrot);
        return person;
    }
}
