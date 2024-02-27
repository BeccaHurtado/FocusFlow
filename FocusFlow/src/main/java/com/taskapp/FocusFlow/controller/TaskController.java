package com.taskapp.FocusFlow.controller;

import java.util.*;
//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.FocusFlow.model.Task;
import com.taskapp.FocusFlow.repo.TaskRepository;
//import com.taskapp.FocusFlow.service.TaskService;
import lombok.Data;

@RestController
//@RequestMapping(path="JSON", produces="application/json")
//@CrossOrigin(origins="*")
public class TaskController {

	@Autowired
    private TaskRepository taskRepo;
	
//	@GetMapping("/")
//	public ResponseEntity<Task> getAllYask(@PathVariable("id") String id, @PathVariable("name") String name, @PathVariable("description") String description, @PathVariable("dueDate") String dueDate, @PathVariable("priority") String priority) {
//		Task task = new Task(id, name, description, dueDate, priority);
//		HttpHeaders headers = new HttpHeaders();
//		ResponseEntity<Task> entity = new ResponseEntity<>(task, headers, HttpStatus.CREATED);
//		return entity;
//	}
	@GetMapping(value = "/tasks")
	public List<Task> getAllTask(){
		//var response = taskRepo.findAll();
		//System.out.println(response);
		return taskRepo.findAll();
	}
	
	@GetMapping(value = "/{taskId}")
	public Task getTaskById(@PathVariable String taskId) {
		return taskRepo.getTaskById(taskId);
	}
	
	@PostMapping(value = "/create")
	public Task addTask(@RequestBody Task task) {
		return taskRepo.save(task);
	}
	
	@PutMapping(value = "/update") 
	public Task updateTask(@RequestBody Task task) {
		return taskRepo.save(task);
	}
	
	@DeleteMapping(value = "/delete/{taskId}")
	public void deleteTask(@PathVariable String taskId) {
		taskRepo.deleteById(taskId);
	}
}
