package org.unitec.clinicav4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@SpringBootApplication
public class Clinicav4Application  implements CommandLineRunner {
@Autowired
	ReactiveMongoTemplate  reactiveMongoTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Clinicav4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	reactiveMongoTemplate.save(new Mensaje("dos","otro")).subscribe();
		System.out.println("se guardo otro");
	}
}
