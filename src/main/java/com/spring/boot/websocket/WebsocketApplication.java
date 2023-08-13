package com.spring.boot.websocket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApplication.class, args);
	}

	@Value("${server.port}")
	private int serverPost;

	@GetMapping("/")
	public String welcomeMessage(){
		return "Spring boot WebSocket Project Running Well on Port " + serverPost;
	}
}
