package com.giochi.lista.giochi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class GiochiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiochiApplication.class, args);
	}

}
