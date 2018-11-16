package proiect.proiect_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("proiect.*")
public class ProiectBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProiectBackendApplication.class, args);
	}
}
