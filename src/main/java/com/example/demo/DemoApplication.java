package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.modelo.Blog;
import com.example.demo.repository.BlogRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {//Metodo que ejecuta el proyecto
		SpringApplication.run(DemoApplication.class, args);
	}
	
	//Anotacion
	@Bean
	public CommandLineRunner setUp(BlogRepository blogRepository) {//Metodo que levanta la Base de datos
		return (args) ->{
			blogRepository.save(new Blog("Titulo 1 Java" ,"Contenido Java"));
			blogRepository.save(new Blog("Titulo 2 Spring" ,"Contenido Spring"));
			blogRepository.save(new Blog("Titulo 3 Spring Boot" ,"Contenido Spring Boot"));
			blogRepository.save(new Blog("Titulo 4 Eclipse" ,"Contenido Eclipse"));
		};
	}
}
