package com.bjit.training.spring.databaseconnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private MessageService messageService;
	@GetMapping("/")
	public Message hello() {
		
		return messageService.getMessage();
	}
	
	@GetMapping("/all")
	public List<Message> all() {
		
		return messageService.getAll();
	}
	
	@PostMapping("/store")
	public void store(@RequestBody Message message) {
		messageService.save(message);
	}
}
