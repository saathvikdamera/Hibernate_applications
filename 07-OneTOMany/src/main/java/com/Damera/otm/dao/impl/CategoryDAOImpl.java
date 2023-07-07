package com.Damera.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Damera.otm.dao.CategoryDAO;
import com.Damera.otm.entities.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	private EntityManagerFactory factory;
	
	public CategoryDAOImpl() {
		factory = Persistence.createEntityManagerFactory("sample");
	}
	
	public void saveCategory(Category category) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(category);
			tx.commit();
			System.out.println("Object persisted in Database...");
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}
	}
	
	public Category fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		Category category = em.find(Category.class, categoryId);
		em.close();
		return category;
	}
	
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Category category = em.find(Category.class, categoryId);
		tx.begin();
		try {
			em.remove(category);
			tx.commit();
			System.out.println("Category Deleted...");
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

}
