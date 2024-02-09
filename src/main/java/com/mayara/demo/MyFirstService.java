package com.mayara.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file.properties")
})
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Value("${my.prop}")
    private String customProperty;
    public String getCustomProperty() {
        return customProperty;
    }

    @Value("${my.custom.property}")
    private String custom;

    public String getCustom() {
        return custom;
    }



    @Value("${my.prop.2}")
    private String custom2;

    public String getCustom2() {
        return custom2;
    }


    public Integer getCustom3() {
        return custom3;
    }

    @Value("${my.custom.property.int}")
    private Integer custom3;

    public MyFirstService
            (@Qualifier("bean2") MyFirstClass myFirstClass
    ){
        this.myFirstClass = myFirstClass;
    }


    public String tellStory(){
        return "the dependency s saying " + myFirstClass.sayHello();
    }


}
