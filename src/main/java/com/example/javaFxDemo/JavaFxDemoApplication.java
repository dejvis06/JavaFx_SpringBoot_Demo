package com.example.javaFxDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class JavaFxDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(JavaFxDemoApplication.class, args);
		Application.launch(JavaFxApplication.class, args);
	}

}
