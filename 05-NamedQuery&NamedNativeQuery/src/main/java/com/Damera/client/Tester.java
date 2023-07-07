package com.Damera.client;

import java.util.List;

import com.Damera.dao.ProductDAO;
import com.Damera.dao.impl.ProductDAOImpl;
import com.Damera.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();
		ProductEntity product = dao.fetchProduct(5132);
		System.out.println(product);
		
//		List<ProductEntity> products = dao.fetchProducts();
//		
//		for(ProductEntity p : products) {
//			System.out.println(p);
//		}

	}

}
