package com.ga.gaAcademy.pyegros.webServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.gaAcademy.pyegros.webServices.entity.Topic;
import com.ga.gaAcademy.pyegros.webServices.repository.TopicRepository;

@Service
public class TopicService {

	
	@Autowired
	TopicRepository topicRepository;
	public Topic createTopic(Topic inputTopic) {
		
		Topic t = topicRepository.save(inputTopic);
		
		
		return null;
	}

}
