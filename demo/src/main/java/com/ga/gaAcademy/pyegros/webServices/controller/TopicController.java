package com.ga.gaAcademy.pyegros.webServices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		Topic t = topicService.createTopic(inputTopic);
		
		return t;
	}
	@GetMapping("/topic")
	public List<Topic> getTopics()
	{
		return topicService.getTopics();
	}
	
	@GetMapping("/topic/{id}") //El juego de llaves, es para especificarle a Java, en el navegador debe ir sin llaves, solo el
							  //número.Ejemplo: localhost:/topic/1
	public Optional<Topic> getOneTopic(@PathVariable int id)
	{  
	   return topicService.getOneTopic(id);
	} 
	@GetMapping("/topic/author/{author}")
	public Optional<Topic> getTopicAuthor(@PathVariable int author)
	{
		return topicService.getTopicAuthor(author);
	}

}
