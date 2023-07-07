package com.Damera.otm.test;

import java.util.Arrays;
import java.util.List;

import com.Damera.otm.dao.CategoryDAO;
import com.Damera.otm.dao.impl.CategoryDAOImpl;
import com.Damera.otm.entities.Category;
import com.Damera.otm.entities.Product;

public class Tester {

	public static void main(String[] args) {

		CategoryDAO dao = new CategoryDAOImpl();

		
		 Product p1 = new Product(); p1.setProductId(103);
		 p1.setProductName("Keyboard");
		  
		 Product p2 = new Product(); p2.setProductId(104); p2.setProductName("Mouse");
		  
		 Category c1 = new Category(); c1.setCategoryId(22022);
		 c1.setCategoryName("Accessories"); c1.setLstOfProducts(Arrays.asList(p1,p2));
		  
		 dao.saveCategory(c1);
		

		/*
		 * Category category = dao.fetchCategory(11011); System.out.println(category);
		 * List<Product> products = category.getLstOfProducts();
		 * 
		 * for(Product p : products) { System.out.println(p); }
		 */

		//dao.removeCategory(22022);

	}

}
