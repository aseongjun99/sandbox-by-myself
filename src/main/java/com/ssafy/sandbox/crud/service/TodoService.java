package com.ssafy.sandbox.crud.service;

import com.ssafy.sandbox.crud.dto.read.TodoResponse;
import com.ssafy.sandbox.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public TodoResponse getTodos() {
        TodoResponse todoResponse = new TodoResponse();
        todoResponse.setTodos(todoRepository.findAll());
        return todoResponse;
    }
}
