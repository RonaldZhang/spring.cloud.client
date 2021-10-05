package com.example.demo.rz.configserver.git;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class Application {

	@Value("${rate}")
	String rate;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
