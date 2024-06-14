package com.saml;

import com.saml.Repository.StudentRepository;
import com.saml.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamlApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(SamlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Alice", "alice@example.com");
		Student student2 = new Student("Bob", "bob@example.com");
		studentRepository.save(student1);
		studentRepository.save(student2);

		studentRepository.findAll().forEach(student -> {
			System.out.println(student.getFirstName()+ " - " + student.getLastName());
		});
	}
	}
