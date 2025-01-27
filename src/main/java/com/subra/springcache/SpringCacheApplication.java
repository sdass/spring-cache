package com.subra.springcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringCacheApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringCacheApplication.class, args);
	}

}
