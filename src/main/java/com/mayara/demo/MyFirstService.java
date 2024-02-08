package com.mayara.demo;

public class MyFirstService {
    private MyFirstClass myFirstClass;

    public String tellStory(){
        return "the dependency s saying " + myFirstClass.sayHello();
    }
}
