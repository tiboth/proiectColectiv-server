package proiect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import proiect.persistence.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {UserRepository.class})
public class ProiectBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProiectBackendApplication.class, args);
	}
}
