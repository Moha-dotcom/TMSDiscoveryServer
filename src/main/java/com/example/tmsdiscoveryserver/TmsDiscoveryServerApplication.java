package com.example.tmsdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TmsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmsDiscoveryServerApplication.class, args);
	}

}
