package com.nhom2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nhom2.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
	
	  List<Category> findByNameContaining(String q);
	
}
