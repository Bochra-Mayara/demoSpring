package com.mayara.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfig {
    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("First Bean");

    }

    @Bean("bean2")
    //@Profile("test")
    public MyFirstClass myFirstClass2(){
        return new MyFirstClass("Second Bean");

    }

    @Bean
    //@Primary
    public MyFirstClass myFirstClass3(){
        return new MyFirstClass("Third Bean");

    }


}
