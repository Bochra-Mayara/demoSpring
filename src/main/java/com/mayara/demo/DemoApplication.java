package com.mayara.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "dev"));
		var ctx = app.run(args);
		MyFirstService myFirstService= ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellStory());
        System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustom());
		System.out.println(myFirstService.getCustom2());
		System.out.println(myFirstService.getCustom3());


	}



}
