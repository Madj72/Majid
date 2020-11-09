package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.Project;

public interface Repo extends CrudRepository<Project, Long> {
	
	@Override
	default Iterable<Project> findAllById(Iterable<Long> ids) {
		return null;
	}

}
