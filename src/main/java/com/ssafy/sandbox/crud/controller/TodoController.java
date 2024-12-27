package com.ssafy.sandbox.crud.controller;

import com.ssafy.sandbox.crud.dto.create.CreateTodoRequest;
import com.ssafy.sandbox.crud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
@CrossOrigin(value = "https://ssafysandbox.vercel.app")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public ResponseEntity<?> getTodos() {
        return ResponseEntity.ok().body(todoService.getTodos());
    }

    @PostMapping
    public ResponseEntity<?> createTodo(@RequestBody CreateTodoRequest createTodoRequest) {
        return ResponseEntity.ok().body(todoService.createTodo(createTodoRequest));
    }

    @PatchMapping("/{todoId}")
    public void updateTodo(@PathVariable int todoId) {
        todoService.updateTodo(todoId);
    }

    @DeleteMapping("/{todoId}")
    public void deleteTodo(@PathVariable int todoId) {

    }
}
