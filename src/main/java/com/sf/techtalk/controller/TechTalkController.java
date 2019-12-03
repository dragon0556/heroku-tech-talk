package com.sf.techtalk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/say-hello")
public class TechTalkController {

	Logger logger = LoggerFactory.getLogger(TechTalkController.class);
	
	@GetMapping
	public String sayHello() {
		
		return "Hello Tech Talk version 2";
	}
	
	
}
