package com.mayara.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    private MyFirstClass myFirstClass;
    public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }



    public String tellStory(){
        return "the dependency s saying " + myFirstClass.sayHello();
    }
}
