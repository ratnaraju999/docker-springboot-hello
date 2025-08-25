package com.dockerexample.DockerDemo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}
	
	 @GetMapping("/")
	    public String hello() {
	        return "Hello World from Spring Boot in Docker!";
	    }
	 @GetMapping("/hello/{name}")
	 public String helloName(@PathVariable String name) {
	     return "Hello, " + name + "!";
	 }
	 @PostMapping("/greet")
	 public String greet(@RequestBody Map<String, String> payload) {
	     return "Hello, " + payload.get("name") + "!";
	 }



}
