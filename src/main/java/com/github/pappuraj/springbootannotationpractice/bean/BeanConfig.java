package com.github.pappuraj.springbootannotationpractice.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

    @Bean
    public Arduino getArduino(){
       return new Arduino();
    }

    //Using bean name
    @Bean(name = "ar2")
    public Arduino getArduino2(){
        return new Arduino();
    }

    @Bean(name = "ar3")
    public Arduino getArduino3(){
        return new Arduino();
    }



}
