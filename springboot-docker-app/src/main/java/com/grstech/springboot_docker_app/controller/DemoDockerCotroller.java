package com.grstech.springboot_docker_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoDockerCotroller {
	
	@GetMapping("/hello/{name}")
	public String getHome(@PathVariable String name) {
		return "Hi "+name +" Welcome to Docker...your docker conteriazation has been done...with FDocker! is Ready" ;
	}
}
