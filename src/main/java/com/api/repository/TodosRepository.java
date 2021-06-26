package com.api.repository;

import com.api.model.Todo;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TodosRepository extends MongoRepository<Todo, String> {
}
