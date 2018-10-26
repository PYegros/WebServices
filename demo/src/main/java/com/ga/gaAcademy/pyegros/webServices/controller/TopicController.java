package com.ga.gaAcademy.pyegros.webServices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Topic getOneTopic(@PathVariable int id)
	{  
	   return topicService.getOneTopic(id);
	} 
	@PutMapping("/topic/{id}")
	public Topic updateTopic (@RequestBody Topic newTopic, @PathVariable int id)
	{
		Topic t = topicService.updateTopic(id,newTopic);
		return t;
	}
	@DeleteMapping("/topic/{id}")
	public ResponseEntity<?> deleteTopic(@PathVariable int id) //DELETE FISICO
	{
		int idTopicABorrar = topicService.deleteTopicFis(id);
		String a = "El topic :" + idTopicABorrar + " fue borrado exitosamente.";
		return new ResponseEntity<String>(a,HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/topic/logic/{id}")
	public ResponseEntity<?> deleteLogicTopic(@PathVariable int id)
	{
		int fueBorrado = topicService.deleteLogicTopic(id);
		if (fueBorrado > 0)
		{
			String msg = "El topic ID: " + fueBorrado + " fue borrado exitosamente";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
