package com.ssafy.sandbox.crud.dto;

import com.ssafy.sandbox.crud.domain.Todo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TodoResponse {

    private List<Todo> todos = new ArrayList<>();
}
