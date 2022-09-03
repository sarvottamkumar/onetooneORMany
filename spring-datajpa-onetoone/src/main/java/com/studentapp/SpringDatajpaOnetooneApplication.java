package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
	
	@Autowired
	IStudentService studentService;

	@Override
	public void run(String... args) throws Exception {
//		
//		Address address = new Address("Chennai","Tamil");
//		Student student = new Student("Jo","ISE",address);
		
		// studentService.addStudent(student);
		
	//	studentService.getByDepartment("ISE").forEach(System.out::println);
		
		System.out.println("************************************");
		
		studentService.getByDepartment("ISE").forEach(System.out::println);
		
		System.out.println("************************************");
		
		studentService.getByCity("Bangalore").forEach(System.out::println);
		
		System.out.println("************************************");
		
		studentService.getByCityAndDepartment("Bangalore","CSE").forEach(System.out::println);
		
		System.out.println("************************************");
		
		studentService.getByCityState("Chennai", "Tamil").forEach(System.out::println);
		
		System.out.println("************************************");
		
		
	}

}
