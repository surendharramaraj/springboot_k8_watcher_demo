package com.kuberneteswatcher.kubewatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KubewatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubewatcherApplication.class, args);
	}

}
