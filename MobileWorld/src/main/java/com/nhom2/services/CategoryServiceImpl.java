package com.nhom2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom2.entities.Category;
import com.nhom2.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo cateRepo;

	@Override
	public Iterable<Category> findAll() {
		return cateRepo.findAll();
	}

	@Override
	public List<Category> search(String q) {
		return cateRepo.findByNameContaining(q);
	}

	@Override
	public Category findOne(int id) {
		return cateRepo.findOne(id);
	}

	@Override
	public void save(Category category) {
		cateRepo.save(category);
	}

	@Override
	public void delete(int id) {
		cateRepo.delete(id);
	}

}
