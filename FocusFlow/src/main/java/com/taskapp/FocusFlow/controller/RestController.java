package com.taskapp.FocusFlow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestController {

	RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8080";
	ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
	//Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);

}
