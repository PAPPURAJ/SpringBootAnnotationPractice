package com.github.pappuraj.springbootannotationpractice;

import com.github.pappuraj.springbootannotationpractice.component.Component_Engineer;
import com.github.pappuraj.springbootannotationpractice.primary.service.Man_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//@SpringBootApplication

@ComponentScan
//@Configuration
//@EnableAutoConfiguration


public class SpringBootAnnotationPracticeApplication {
    private static CheckpointForAll checkpoint;
    @Autowired
    Man_service man;
    public static void main(String[] args) {
        System.out.println("Main");
        ApplicationContext context=SpringApplication.run(SpringBootAnnotationPracticeApplication.class, args);
        checkpoint=new CheckpointForAll(context);

        // checkpoint.component();
        // checkpoint.autowired();
        //  checkpoint.qualifier();
        // checkpoint.qualifier();
        // checkpoint.primary();
         checkpoint.bean();
    }



}
