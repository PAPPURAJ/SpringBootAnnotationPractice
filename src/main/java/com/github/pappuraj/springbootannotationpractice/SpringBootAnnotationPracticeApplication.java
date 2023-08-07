package com.github.pappuraj.springbootannotationpractice;

import com.github.pappuraj.springbootannotationpractice.component.Component_Engineer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotationPracticeApplication {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context=SpringApplication.run(SpringBootAnnotationPracticeApplication.class, args);
        component();
    }


    static void component(){
        Component_Engineer engineer=context.getBean(Component_Engineer.class);
        engineer.display();
    }

}
