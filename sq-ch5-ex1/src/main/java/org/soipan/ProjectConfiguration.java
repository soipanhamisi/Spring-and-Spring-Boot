package org.soipan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
    @Bean
    public HelloWorld hello1(){
         return new HelloWorld();
     }
     @Bean
     public HelloWorld hello2(){
        return new HelloWorld();
     }
}
