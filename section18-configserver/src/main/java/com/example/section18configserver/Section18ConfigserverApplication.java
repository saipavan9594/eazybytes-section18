package com.example.section18configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Section18ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section18ConfigserverApplication.class, args);
	}

}
