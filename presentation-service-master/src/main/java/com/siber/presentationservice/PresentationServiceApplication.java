package com.siber.presentationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients 
public class PresentationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresentationServiceApplication.class, args);
	}

}
