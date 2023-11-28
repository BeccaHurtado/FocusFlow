package com.taskapp.FocusFlow.service;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskapp.FocusFlow.model.Task;
import com.taskapp.FocusFlow.repo.TaskRepository;

//import com.example.bookstore.dto.Response;
//import com.example.bookstore.entity.Post;

@Service
public interface TaskService {
	
    Response addTask(Task task);

    Response editTask(String taskId, Task task);

    Response deleteTask(String taskId);

    Response getAllTask();

    Response getTaskById(String taskId);
}
