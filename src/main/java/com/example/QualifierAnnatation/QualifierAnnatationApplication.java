package com.example.QualifierAnnatation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QualifierAnnatationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierAnnatationApplication.class, args);
	}
	@Bean("WORD")
	public WordFileReader getWordFileReader(){
		return new WordFileReader();
	}

}
