//package com.taskapp.FocusFlow.controller;
//
//import org.springframework.data.mongodb.core.messaging.Task;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//public class RestController {
//
//	RestTemplate restTemplate = new RestTemplate();
//	String url = "http://localhost:8080";
//	ResponseEntity<Task> response = restTemplate.getForEntity(url, Task.class);
//	
//	Task task = response.getBody();
//	
//	@SuppressWarnings("deprecation")
//	int statusCode = response.getStatusCodeValue();
//	
//	HttpStatusCode httpStatus = response.getStatusCode();
//	
//	HttpHeaders httpHeaders = response.getHeaders();
//
//}
