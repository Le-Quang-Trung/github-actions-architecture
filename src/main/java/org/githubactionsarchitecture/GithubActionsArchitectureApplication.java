package org.githubactionsarchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubActionsArchitectureApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to GitHub ";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubActionsArchitectureApplication.class, args);
	}

}
