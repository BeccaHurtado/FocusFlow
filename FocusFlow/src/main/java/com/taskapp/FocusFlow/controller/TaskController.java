package com.taskapp.FocusFlow.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.FocusFlow.model.Task;
import com.taskapp.FocusFlow.service.TaskService;

@RestController
@RequestMapping(value = "/task", produces = "application/json")
public class TaskController {

	@Autowired(required = false)
    TaskService taskService;

    @PostMapping("/add-task")
    Response addTask(@RequestBody Task task) {
        Response res = taskService.addTask(task);
        return res;
    }

    @PostMapping("/edit-task/{taskId}")
    Response editPost(@PathVariable("taskId") String taskId, @RequestBody Task task) {
        Response res = taskService.editTask(taskId, task);
        return res;
    }

    @DeleteMapping("/delete-task/{taskId}")
    Response deleteTask(@PathVariable("taskId") String taskId) {
        Response res = taskService.deleteTask(taskId);
        return res;
    }

    @GetMapping("/get-all-task")
    Response getAllTask() {
        Response res = taskService.getAllTask();
        return res;
    }

    @GetMapping("/get-task-by-id/{taskId}")
    Response getTaskById(@PathVariable("taskId") String taskId) {
        Response res = taskService.getTaskById(taskId);
        return res;
    }
}
