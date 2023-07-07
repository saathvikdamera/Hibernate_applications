package com.Damera.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.Damera.dao.StudentDAO;
import com.Damera.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {
	
	private EntityManagerFactory factory;
	
	public StudentDAOImpl() {
		factory = Persistence.createEntityManagerFactory("test");
	}
	
	@Override
	public List<StudentEntity> fetchStudents() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<StudentEntity> query = em.createNamedQuery("query1", StudentEntity.class);
		List<StudentEntity> list = query.getResultList();
		em.close();
		return list;
	}

}
