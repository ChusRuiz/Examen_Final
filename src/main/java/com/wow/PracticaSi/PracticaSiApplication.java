package com.wow.PracticaSi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@Configuration
@EnableSwagger2
public class PracticaSiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaSiApplication.class, args);
	}
	@Bean

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.wow.PracticaSi"))
				.paths(regex("/.*"))
				.build();
	}

}
