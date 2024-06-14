package com.saml;

import com.saml.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SamlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("mouad","elkbabty");
	}
}
