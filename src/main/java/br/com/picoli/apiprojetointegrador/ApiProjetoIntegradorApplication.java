package br.com.picoli.apiprojetointegrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "br.com")
@ComponentScan(basePackages = "br.com")
@EnableJpaRepositories(basePackages = "br.com")
@SpringBootApplication
public class ApiProjetoIntegradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProjetoIntegradorApplication.class, args);
	}

}
