package com.ga.gaAcademy.pyegros.webServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.ga.gaAcademy.pyegros.webServices.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer>{

}
