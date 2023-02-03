package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Employee;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class Demo5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
		System.out.println("started");
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(0);
		e.setDesc("dse");
		e.setName("gaurav");
		System.out.println(e);
		
	}

}
