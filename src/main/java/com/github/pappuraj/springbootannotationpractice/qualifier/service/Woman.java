package com.github.pappuraj.springbootannotationpractice.qualifier.service;


import org.springframework.stereotype.Component;

@Component
public class Woman implements Human {
    @Override
    public void viewName() {
        System.out.println("I'm woman");
    }
}
