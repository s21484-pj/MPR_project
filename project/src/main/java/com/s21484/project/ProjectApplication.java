package com.s21484.project;

import com.s21484.project.repositories.DatabaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean(name = "dbRepo")
	public DatabaseRepository databaseRepositorySingleton()
	{
		return new DatabaseRepository();
	}

}
