package com.github.pappuraj.springbootannotationpractice.qualifier.controller;


import com.github.pappuraj.springbootannotationpractice.qualifier.service.Human;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Qualifier {

    @org.springframework.beans.factory.annotation.Qualifier("woman")
    @Autowired
    private Human human;



}
