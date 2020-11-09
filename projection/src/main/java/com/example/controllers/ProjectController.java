package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.service;
import com.project.Project;

@RestController	
public class ProjectController {

	
	@Autowired
	private service ser;
	
	
	@PostMapping("api/index")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
		ser.saveOrUpdateProject(project);
		return new ResponseEntity <Project>(project , HttpStatus.ACCEPTED);
		
	}
	
}
