package br.com.mcr.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerMessengerController {

	@GetMapping("/messages")
	public String getMessage() {
		return "Hello from Docker!";
		
	}
	
}