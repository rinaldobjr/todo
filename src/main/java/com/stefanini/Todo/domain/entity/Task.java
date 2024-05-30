package com.stefanini.Todo.domain.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="tb_tasks", schema="todolist")
public class Task implements Serializable {

	//private static final long serialversionsUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Basic(optional = false)
	private Long id;
	
	@Column(name = "title_task")
	private String titleTask;
	
	@Column(name = "description_task")
	private String descriptionTask;
	
	@Column(name = "status_task")
	private String status_task;
	
	@Column(name = "datecreated_task")
	private String dateCreatedTask;
	
}
