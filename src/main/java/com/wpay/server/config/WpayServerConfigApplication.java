package com.wpay.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableConfigServer
public class WpayServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpayServerConfigApplication.class, args);
	}

}
