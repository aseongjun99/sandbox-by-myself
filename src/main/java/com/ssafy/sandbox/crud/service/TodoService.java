package com.ssafy.sandbox.crud.service;

import com.ssafy.sandbox.crud.dto.TodoResponse;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public TodoResponse getTodos() {
        return new TodoResponse();
    }
}
