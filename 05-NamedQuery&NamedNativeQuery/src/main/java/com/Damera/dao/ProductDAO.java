package com.Damera.dao;

import java.util.List;

import com.Damera.entity.ProductEntity;

public interface ProductDAO {
	
	ProductEntity fetchProduct(Integer productId);
	
	List<ProductEntity> fetchProducts();

}
