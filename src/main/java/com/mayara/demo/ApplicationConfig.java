package com.mayara.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("First Bean");

    }

    @Bean("bean2")
    public MyFirstClass myFirstClass2(){
        return new MyFirstClass("Second Bean");

    }

    @Bean
    //@Primary
    public MyFirstClass myFirstClass3(){
        return new MyFirstClass("Third Bean");

    }


}
