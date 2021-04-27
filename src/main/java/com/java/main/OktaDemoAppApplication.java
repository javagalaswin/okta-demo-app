package com.java.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.RestController;

@RestController


@SpringBootApplication
public class OktaDemoAppApplication {
	
	@GetMapping("/hello")
    String helloUser(@AuthenticationPrincipal OidcUser user) {
		return "Hello User Successfully Logged-in !";
    }

	public static void main(String[] args) {
		SpringApplication.run(OktaDemoAppApplication.class, args);
	}

}
