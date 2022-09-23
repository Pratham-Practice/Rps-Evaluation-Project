package com.example.Customerservice.fisCustomerrservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value="com.example.Customerservice.fisCustomerrservice.service")
public class FisCustomerrserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisCustomerrserviceApplication.class, args);
	}

}
