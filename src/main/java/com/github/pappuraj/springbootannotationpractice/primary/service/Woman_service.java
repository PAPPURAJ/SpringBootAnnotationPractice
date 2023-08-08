package com.github.pappuraj.springbootannotationpractice.primary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Woman_service implements Human_service {

    @Override
    public void viewName() {
        System.out.println("I'm woman from @primary");
    }
}