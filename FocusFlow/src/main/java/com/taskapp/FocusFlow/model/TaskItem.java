package com.taskapp.FocusFlow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class TaskItem {
	@Id
    private String id;

    private String name;
    private String description ;
    private String category;
    private String date;
    private String priority;
    
    public TaskItem(String id, String name, String description, String category, String date, String priority) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
