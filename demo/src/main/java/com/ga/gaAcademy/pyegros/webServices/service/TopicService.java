package com.ga.gaAcademy.pyegros.webServices.service;

import java.util.List;
import java.util.Optional;

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
		return t;
	}
	
	public List<Topic> getTopics()
	{	
		return topicRepository.findAll();
	}
	
	public Optional<Topic> getOneTopic(int id)
	{	
		return topicRepository.findById(id);
	}
	public Optional<Topic> getTopicAuthor(int author)
	{
		return topicRepository.findById(author);
	}
}
