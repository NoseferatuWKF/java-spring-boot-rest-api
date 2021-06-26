package com.api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {

    @Id
    private final String id;
    private final String task;
    private final int progress;
    private final Date createdDate;
    private final Date updatedDate;

    public Todo(String id, String task, int progress, Date createdDate, Date updatedDate) {
        this.id = id;
        this.task = task;
        this.progress = progress;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public String getId() {
        return this.id;
    }

    public String getTask() {
        return this.task;
    }

    public int getProgress() {
        return this.progress;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }
}
