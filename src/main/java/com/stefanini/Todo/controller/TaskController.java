package com.stefanini.Todo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.Todo.domain.entity.Task;
import com.stefanini.Todo.service.TaskService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(path="/api/v1/task")
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class TaskController {

	private TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@ApiOperation(value = "Get All Tasks")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 500, message = "Internal server error") })
    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Task>> findAll() {
        return ResponseEntity.ok().body(this.taskService.findTaskAll());
    }
	
	
}
