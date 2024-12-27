package com.ssafy.sandbox.crud.service;

import com.ssafy.sandbox.crud.domain.Todo;
import com.ssafy.sandbox.crud.dto.create.CreateTodoRequest;
import com.ssafy.sandbox.crud.dto.create.CreateTodoResponse;
import com.ssafy.sandbox.crud.dto.read.TodoResponse;
import com.ssafy.sandbox.crud.dto.update.UpdateTodoResponse;
import com.ssafy.sandbox.crud.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public TodoResponse getTodos() {
        TodoResponse todoResponse = new TodoResponse();
        todoResponse.setTodos(todoRepository.findAll());
        return todoResponse;
    }

    public CreateTodoResponse createTodo(CreateTodoRequest createTodoRequest) {
        Todo todo = new Todo();
        todo.setContent(createTodoRequest.getContent());
        todoRepository.save(todo);
        CreateTodoResponse createTodoResponse = new CreateTodoResponse();
        createTodoResponse.setId(todo.getId());
        createTodoResponse.setCompleted(todo.getCompleted());
        return createTodoResponse;
    }

    @Transactional
    public void updateTodo(int todoId) {
        Todo todo = todoRepository.findTodoById(todoId);
        todo.setCompleted(!todo.getCompleted());
    }
}
