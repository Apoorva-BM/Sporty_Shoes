package org.simplileran.sportyShoe.dao;

import java.util.List;

import org.simplileran.sportyShoe.entity.Product;

public interface ProductDao {

	List<Product> getAllProduct();
	Product getProductByName(String name);
}
