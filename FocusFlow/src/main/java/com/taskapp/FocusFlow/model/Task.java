package com.taskapp.FocusFlow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("task")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	@Id
    private String id;

    private String name;
    private String description ;
    private String date;
    private String priority;
    
    public Task(String id, String name, String description, String date, String priority) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
    

}
