package com.master.formacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FormacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacionApplication.class, args);
	}

	/**
	* Crea y devuelve una nueva instancia de la clase RestTemplate.
	*
	* @return   una nueva instancia de la clase RestTemplate
	*/
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
