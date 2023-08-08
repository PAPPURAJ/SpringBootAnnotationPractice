package com.github.pappuraj.springbootannotationpractice.primary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Man_service implements Human_service {

    @Override
    public void viewName() {
        System.out.println("I'm man from @primary");
    }
}