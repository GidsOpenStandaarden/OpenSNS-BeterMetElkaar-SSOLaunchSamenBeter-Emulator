package nl.edia.sns.consumer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */
@SpringBootApplication
//@ComponentScan("nl.edia.sns.consumer.example")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
