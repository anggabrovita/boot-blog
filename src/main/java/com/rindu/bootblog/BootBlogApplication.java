package com.rindu.bootblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootBlogApplication.class, args);
	}

}
