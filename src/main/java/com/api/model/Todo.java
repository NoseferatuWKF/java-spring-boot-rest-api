package com.api.model;

public class Todo {
    private final long id;
    private final String task;

    public Todo(long id, String task) {
        this.id = id;
        this.task = task;
    }

    public long getId() {
        return this.id;
    }

    public String getTask() {
        return this.task;
    }
}
