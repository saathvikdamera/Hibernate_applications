package com.Damera.client;

import com.Damera.ProductDAO.ProductDAO;
import com.Damera.ProductDAOImpl.ProductDAOImpl;
import com.Damera.entity.ProductEntity;

public class Test {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();
		
		
		ProductEntity p1 = new ProductEntity();
		p1.setProductId(5834);
		p1.setProductName("TV");
		p1.setQuantity(1);
		p1.setUnitPrice(35000.0);
		
		dao.saveProduct(p1);

		//ProductEntity entity = dao.fetchProduct(5145);
		//System.out.println(entity);
		
		/*
		ProductEntity entity = dao.updateProduct(5132, 55000.0);
		System.out.println(entity);
		*/
		
		//dao.deleteProduct(5158);

	}

}
