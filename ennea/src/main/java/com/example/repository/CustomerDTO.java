package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.ModelClass;

@Repository
public interface CustomerDTO extends CrudRepository<ModelClass, Integer>{
	
}
