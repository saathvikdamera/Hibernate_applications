package com.Damera.ProductDAOImpl;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Damera.ProductDAO.ProductDAO;
import com.Damera.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
	
	private EntityManagerFactory factory;
	
	public ProductDAOImpl() {
		factory = Persistence.createEntityManagerFactory("test");
	}

	@Override
	public void saveProduct(ProductEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			manager.persist(entity);
			tx.commit();
			System.out.println("Object persisted in database..");
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Object not persisted in database..");
			System.out.println(e);
		}finally {
			manager.close();
		}
	}

	@Override
	public ProductEntity fetchProduct(Integer productId) {
		EntityManager manager = factory.createEntityManager();
		ProductEntity entity = manager.find(ProductEntity.class, productId);
		manager.close();
		return entity;
	}

	@Override
	public ProductEntity updateProduct(Integer productId, Double new_unit_price) {
		EntityManager manager = factory.createEntityManager();
		ProductEntity entity = manager.find(ProductEntity.class, productId);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			entity.setUnitPrice(new_unit_price);
			tx.commit();
			System.out.println("Object updated...");
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Object not updated..");
			System.out.println(e);
		}finally {
			manager.close();
		}
		return entity;
	}

	@Override
	public void deleteProduct(Integer productId) {
		EntityManager manager = factory.createEntityManager();
		ProductEntity entity = manager.find(ProductEntity.class, productId);
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			manager.remove(entity);
			tx.commit();
			System.out.println("Object deleted...");
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Object not deleted...");
			System.out.println(e);
		}finally {
			manager.close();
		}
	}

}
