package com.Damera.client;

import java.util.Iterator;
import java.util.List;

import com.Damera.dao.ProductDAO;
import com.Damera.dao.impl.ProductDAOImpl;
import com.Damera.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAOImpl();
		
		//List<Object[]> productNamesAndPrice = dao.fetchProductNamesAndPrice();
		
		List<ProductEntity> products = dao.productsPriceGreaterThan(25000.0);
		
		Iterator<ProductEntity> it = products.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
