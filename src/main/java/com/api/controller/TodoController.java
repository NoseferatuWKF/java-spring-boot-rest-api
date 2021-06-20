package com.api.controller;

import com.api.constants.URLConstants;
import com.api.model.Todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConstants.main + "/todo")
public class TodoController {
    private final Todo[] todos = { new Todo(0, "First task"), new Todo(1, "Second task"), new Todo(2, "Third task"),
            new Todo(3, "Fourth task") };

    @GetMapping()
    public Todo[] getTodos() {
        return this.todos;
    }
}
