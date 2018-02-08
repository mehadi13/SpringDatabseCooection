package com.bjit.training.spring.databaseconnection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	public Message getMessage() {
		Message m = new Message();
		m.setId(5);
		m.setMessageHeader("m head");
		m.setMessageBody("m body");
		return m;
	}
	
	public void save(Message message) {
		System.out.println(message.getMessageBody());
		messageRepository.save(message);
	}
	
	public List<Message> getAll(){
		return messageRepository.findAll();
	}
}
