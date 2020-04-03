package com.hyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HyhEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyhEurekaNamingServerApplication.class, args);
	}

}
