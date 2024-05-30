package com.stefanini.Todo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stefanini.Todo.domain.entity.Task;
import com.stefanini.Todo.domain.repository.TaskRepository;
import com.stefanini.Todo.service.TaskService;

@Service
public class TaskServiceImpl  implements TaskService {
	
	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
//	@Override
//	public Task createTask(Task task) {
//		return this.taskRepository.save(task);
//	}

	@Override
	public List<Task> findTaskAll() {
		return this.taskRepository.findAll();
	}


}
