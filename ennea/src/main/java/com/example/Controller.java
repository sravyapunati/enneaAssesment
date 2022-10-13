package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.serviceImpl;

@RestController
public class Controller {
	
	@Autowired
	private serviceImpl service;
	
	@RequestMapping(path = "injectData")
	public void setDataInDB() {
		service.saveData();
	}
}
