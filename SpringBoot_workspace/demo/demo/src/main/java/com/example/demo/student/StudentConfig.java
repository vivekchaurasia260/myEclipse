package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			 Student vivek=new Student("Martin Roger", "rozermart779@gmail.com", LocalDate.of(1989, Month.DECEMBER, 27));
			 Student sirius=new Student("Andrew Dea", "andrewd991@gmail.com", LocalDate.of(1995, Month.FEBRUARY, 17));
			 Student adam=new Student("Jack Lich", "lich.zack991@orkut.com", LocalDate.of(1976, Month.NOVEMBER, 3));
			 
			 repository.saveAll(List.of(vivek, sirius, adam));
		};
	}
}
