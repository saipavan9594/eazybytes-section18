package com.example.section18cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class Section14CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section14CardsApplication.class, args);
	}

}
