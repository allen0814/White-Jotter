package com.gm.lyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class LylApplication {

	public static void main(String[] args) {
		SpringApplication.run(LylApplication.class, args);
	}
}
