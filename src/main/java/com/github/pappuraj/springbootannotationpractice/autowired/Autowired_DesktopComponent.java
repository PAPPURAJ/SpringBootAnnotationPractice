package com.github.pappuraj.springbootannotationpractice.autowired;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Autowired_DesktopComponent {

    private SSD ssd;


    //This is constructor injection
    @Autowired
    public Autowired_DesktopComponent(SSD ssd){
        this.ssd=ssd;
    }





}
