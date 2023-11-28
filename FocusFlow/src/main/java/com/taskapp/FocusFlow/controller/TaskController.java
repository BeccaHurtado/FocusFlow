package com.taskapp.FocusFlow.controller;

import java.util.*;
//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.FocusFlow.model.Task;
import com.taskapp.FocusFlow.repo.TaskRepository;
//import com.taskapp.FocusFlow.service.TaskService;

@RestController
public class TaskController {

	@Autowired
    private TaskRepository taskRepo;
	
	@GetMapping(value = "/")
	public List<Task> getAllTask(){
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
	
	@PutMapping(value = "/update/{taskId}") 
	public Task updateTask(@PathVariable String taskId, @RequestBody Task task) {
		return taskRepo.save(task);
	}
	
	@DeleteMapping(value = "/delete/{taskId}")
	public void deleteTask(@PathVariable String taskId) {
		taskRepo.deleteById(taskId);
	}
}
