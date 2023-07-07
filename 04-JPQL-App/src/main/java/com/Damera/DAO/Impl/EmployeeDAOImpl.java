package com.Damera.DAO.Impl;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.Damera.DAO.EmployeeDAO;
import com.Damera.constants.AppConstants;
import com.Damera.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public EmployeeEntity fetchEmployeeById(Integer empNumber) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY1,EmployeeEntity.class);
		tq.setParameter(1, empNumber);
		
		EmployeeEntity entity = tq.getSingleResult();
		return entity;
	}

	@Override
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY2,EmployeeEntity.class);
		List<EmployeeEntity> lst = tq.getResultList();
		return lst;
	}

	@Override
	public List<Object[]> fetchEmployeeNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3,Object[].class);
		List<Object[]> list = tq.getResultList();
		return list;
	}

}
