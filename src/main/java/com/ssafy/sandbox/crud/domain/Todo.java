package com.ssafy.sandbox.crud.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String content;

    @Column
    private Boolean completed;
}
