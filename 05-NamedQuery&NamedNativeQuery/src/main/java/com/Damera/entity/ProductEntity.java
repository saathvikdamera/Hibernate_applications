package com.Damera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_product")
@Data
@NamedQuery(name = "query1", query = "FROM ProductEntity e WHERE e.productId = ?1")
@NamedNativeQuery(name="query2",query = "Select * from tbl_product",resultClass = ProductEntity.class)
public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;
	
	private Integer quantity;
	
	@Column(name = "unit_price")
	private double unitPrice;

}
