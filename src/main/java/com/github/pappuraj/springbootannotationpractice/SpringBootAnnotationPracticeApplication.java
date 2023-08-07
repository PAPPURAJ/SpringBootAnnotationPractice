package com.github.pappuraj.springbootannotationpractice;

import com.github.pappuraj.springbootannotationpractice.component.Component_Engineer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan

public class SpringBootAnnotationPracticeApplication {
    private static CheckpointForAll checkpoint;

    public static void main(String[] args) {
        System.out.println("Main");
        ApplicationContext context=SpringApplication.run(SpringBootAnnotationPracticeApplication.class, args);
        checkpoint=new CheckpointForAll(context);

        //checkpoint.component();
        checkpoint.autowired();
    }



}
