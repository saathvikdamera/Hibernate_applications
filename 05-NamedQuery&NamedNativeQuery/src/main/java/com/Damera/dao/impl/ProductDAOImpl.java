package com.Damera.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.Damera.dao.ProductDAO;
import com.Damera.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
	
	private EntityManagerFactory factory;
	
	public ProductDAOImpl() {
		factory = Persistence.createEntityManagerFactory("test");
	}

	public ProductEntity fetchProduct(Integer productId) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<ProductEntity> query = em.createNamedQuery("query1", ProductEntity.class);
		query.setParameter(1, productId);
		ProductEntity entity = query.getSingleResult();
		em.close();
		return entity;
	}
	
	public List<ProductEntity> fetchProducts() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<ProductEntity> query = em.createNamedQuery("query2",ProductEntity.class);
		List<ProductEntity> list = query.getResultList();
		return list;
	}

}
