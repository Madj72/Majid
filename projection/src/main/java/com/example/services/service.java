package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.Repo;
import com.project.Project;

@Service
public class service {
	
	
	@Autowired
	private Repo repo;
	
	
	public Project saveOrUpdateProject(Project project) {
		
		return repo.save(project);
	}

}
