package pl.pawel.linkshell.createyourself;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.pawel.linkshell.createyourself.model.lifesense.FundamentalDogma;

import java.util.Arrays;

@SpringBootApplication
public class CreateyourselfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateyourselfApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("\nLet's inspect the beans provided by Spring Boot:\n");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
