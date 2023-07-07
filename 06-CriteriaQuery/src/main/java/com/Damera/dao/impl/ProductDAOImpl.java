package com.Damera.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.Damera.dao.ProductDAO;
import com.Damera.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
	
	private EntityManagerFactory factory;
	
	public ProductDAOImpl() {
		factory = Persistence.createEntityManagerFactory("sample");
	}
	
	public List<Object[]> fetchProductNamesAndPrice() {
		EntityManager em = factory.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Object[]> query = cb.createQuery(Object[].class);
		Root<ProductEntity> root = query.from(ProductEntity.class);
		query.select(cb.array(root.get("productName"),root.get("unitPrice")));
		TypedQuery<Object[]> typedQuery = em.createQuery(query);
		List<Object[]> list = typedQuery.getResultList();
		return list;
	}
	
	public List<ProductEntity> productsPriceGreaterThan(Double price) {
		EntityManager em = factory.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<ProductEntity> query = cb.createQuery(ProductEntity.class);
		Root<ProductEntity> root = query.from(ProductEntity.class);
		query.select(root).where(cb.gt(root.<Double>get("unitPrice"), price));
		TypedQuery<ProductEntity> typedQuery = em.createQuery(query);
		List<ProductEntity> list = typedQuery.getResultList();
		return list;
	}
	

}
