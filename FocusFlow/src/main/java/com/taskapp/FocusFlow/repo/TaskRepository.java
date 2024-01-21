package com.taskapp.FocusFlow.repo;

import java.util.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.taskapp.FocusFlow.model.Task;

@Repository
public interface TaskRepository extends MongoRepository <Task, String> {
  @Query("{_id: '?0'}")
  Task getTaskById(String taskId);
<<<<<<< HEAD

  //Task save(String taskId);
   
=======
  
  // testing if commit goes through
    
  // testing commit w/ new token
>>>>>>> branch 'main' of https://github.com/BeccaHurtado/FocusFlow.git
}
