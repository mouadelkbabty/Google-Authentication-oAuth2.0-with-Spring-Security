package com.saml;

import com.saml.Repository.StudentRepository;
import com.saml.Repository.UserRepository;
import com.saml.models.Student;
import com.saml.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamlApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(SamlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User student1 = new User( "alice@example.com");
		Student student2 = new Student("Bob", "bob@example.com");
		userRepository.save(student1);
		studentRepository.save(student2);

		studentRepository.findAll().forEach(student -> {
			System.out.println(student.getFirstName()+ " - " + student.getLastName());
		});
	}
	}
