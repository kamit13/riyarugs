package com.riyarugs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.riyarugs.controller.ProductController;

@SpringBootApplication
public class RiyaRugsApplication {
	public static void main(String[] args) {
		SpringApplication.run(RiyaRugsApplication.class, args);
	}

}
