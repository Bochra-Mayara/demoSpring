package com.mayara.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstClass {
    private String myVar;
    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }



    public String sayHello(){
        return "Hello from a MyFirstClass ==> myVar = " + myVar ;


    }
}
