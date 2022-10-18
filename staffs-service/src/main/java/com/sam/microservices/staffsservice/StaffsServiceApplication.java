package com.sam.microservices.staffsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StaffsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffsServiceApplication.class, args);
	}

}
