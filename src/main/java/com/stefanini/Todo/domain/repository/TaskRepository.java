package com.stefanini.Todo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.Todo.domain.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
