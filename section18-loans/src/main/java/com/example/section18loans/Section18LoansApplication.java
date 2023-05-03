package com.example.section18loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@RefreshScope
public class Section18LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section18LoansApplication.class, args);
	}

}
