package com.ga.gaAcademy.pyegros.webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ga.gaAcademy.pyegros.webServices.entity.Topic;
import com.ga.gaAcademy.pyegros.webServices.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@PostMapping("/topic")
    public Topic createTopic (@RequestBody Topic inputTopic) {
		Topic returnTopic = topicService.createTopic(inputTopic);
		
		
		
		
		return null;
	}
	
}
