package com.Damera.ProductDAO;

import com.Damera.entity.ProductEntity;

public interface ProductDAO {
	
	void saveProduct(ProductEntity entity);
	
	ProductEntity fetchProduct(Integer productId);
	
	ProductEntity updateProduct(Integer productId,Double new_unit_price);
	
	void deleteProduct(Integer productId);

}
