package com.ssafy.sandbox.crud.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Getter
public class Todo {

    private Integer id;
    private String content;
    private Boolean completed;
}
