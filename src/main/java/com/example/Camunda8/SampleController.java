package com.example.Camunda8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.camunda.zeebe.client.ZeebeClient;

@RestController
public class SampleController {
	
	@Autowired
	ZeebeClient client;
	
	
	public String onBoard() {
		client.newActivateJobsCommand().jobType("test");
		return "Success";
	}

}
