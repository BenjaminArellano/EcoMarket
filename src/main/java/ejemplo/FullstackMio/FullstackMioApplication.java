package ejemplo.FullstackMio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"producto.model", "pedido.model", "usuario.model"})
@EnableJpaRepositories(basePackages = {"producto.repository", "pedido.repository", "usuario.repository"})
@ComponentScan(basePackages = {"producto.controller", "pedido.controller", "usuario.controller"})
@ComponentScan(basePackages = {"producto.services", "pedido.services", "usuario.service"})
public class FullstackMioApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackMioApplication.class, args);
	}

}
