package com.dockerImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerImplApplication {

	@GetMapping("/fetch")
	public String getDetails(String str){
		return "this is created for docker implementation";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerImplApplication.class, args);
	}

}
