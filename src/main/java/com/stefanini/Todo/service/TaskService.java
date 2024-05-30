package com.stefanini.Todo.service;

import java.util.List;

import com.stefanini.Todo.domain.entity.Task;

public interface TaskService {

	List<Task> findTaskAll();

}
