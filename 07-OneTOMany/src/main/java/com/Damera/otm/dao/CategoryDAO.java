package com.Damera.otm.dao;

import com.Damera.otm.entities.Category;

public interface CategoryDAO {
	
	void saveCategory(Category category);
	
	Category fetchCategory(Integer categoryId);
	
	void removeCategory(Integer categoryId);

}
