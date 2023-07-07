package com.Damera.dao;

import java.util.List;

import com.Damera.entity.ProductEntity;

public interface ProductDAO {
	
	List<Object[]> fetchProductNamesAndPrice();
	
	List<ProductEntity> productsPriceGreaterThan(Double price);

}
