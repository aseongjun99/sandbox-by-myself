package com.ssafy.sandbox.crud.repository;

import com.ssafy.sandbox.crud.domain.Todo;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
