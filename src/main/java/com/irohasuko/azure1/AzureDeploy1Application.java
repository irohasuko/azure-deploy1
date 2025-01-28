package com.irohasuko.azure1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AzureDeploy1Application extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AzureDeploy1Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureDeploy1Application.class, args);
	}

}
