package com.api.controller;

import java.util.List;

import com.api.constants.URLConstants;
import com.api.model.Todo;
import com.api.repository.TodosRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLConstants.main + "/todos")
@CrossOrigin(origins = "*")
public class TodoController {

    private TodosRepository repository;

    public TodoController(TodosRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Todo> getTodos() {
        return this.repository.findAll();
    }
}
