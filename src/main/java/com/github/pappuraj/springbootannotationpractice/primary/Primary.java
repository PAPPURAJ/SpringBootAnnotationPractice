package com.github.pappuraj.springbootannotationpractice.primary;

import com.github.pappuraj.springbootannotationpractice.primary.service.Human_service;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Getter
public class Primary {

    @Autowired
    private Human_service human;



}
