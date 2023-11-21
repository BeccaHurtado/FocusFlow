package com.taskapp.FocusFlow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskapp.FocusFlow.repo.TaskRepository;

@SpringBootApplication
@RestController
@EnableMongoRepositories
public class FocusFlowApplication implements CommandLineRunner{

	@Autowired
	TaskRepository TaskItemRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FocusFlowApplication.class, args);
	}
	
	// gave error if this wasn't included. Doesn't say to add this in MongoDB steps.
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@GetMapping("/")
	public String apiRoot() {
		return "FocusFlow"
				+ "The application where you can organize your tasks!";
	}
	
}


  
