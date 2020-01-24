package com.architecture.dao;

import java.util.List;

public interface CrudRepository <T> {
	
	int save(T t);
	int update(T t);
	int delete(T t);
	T findById(int id);
	List<T> findAll();
	
}
