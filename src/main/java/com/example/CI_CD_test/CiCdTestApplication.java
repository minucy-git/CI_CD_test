package com.example.CI_CD_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CiCdTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdTestApplication.class, args);
	}

}

@RestController
class MyRestController {
	@GetMapping("/hello")
	String test1() {
		return "hello";
	}

	@GetMapping("/hello2")
	String test2() {
		return "hello2";
	}
}
