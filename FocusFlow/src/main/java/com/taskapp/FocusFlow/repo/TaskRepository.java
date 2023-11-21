package com.taskapp.FocusFlow.repo;

import java.util.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.taskapp.FocusFlow.model.TaskItem;

public interface TaskRepository extends MongoRepository <TaskItem, String> {
	@Query("{name:'?0'}")
    TaskItem findItemByName(String name);
    
    @Query(value="{description:'?0'}", fields="{'name' : 1, 'priority' : 1}")
    List<TaskItem> findAll(String category);
    
    public long count();
}
