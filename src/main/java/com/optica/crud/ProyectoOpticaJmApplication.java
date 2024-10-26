package com.optica.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class ProyectoOpticaJmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoOpticaJmApplication.class, args);
	}

}
