package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring", "Spring Framework", "Spring description")
				, new Topic("java", "java Framework", "java description")
				, new Topic("javascript", "javascript Framework", "javascript description"));
	}
}
