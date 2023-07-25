package org.simplileran.sportyShoe.service.impl;

import java.util.List;

import org.simplileran.sportyShoe.dao.ProductDao;
import org.simplileran.sportyShoe.dao.impl.ProductDaoImpl;
import org.simplileran.sportyShoe.entity.Product;
import org.simplileran.sportyShoe.service.ProductService;

public class ProductServiceImpl implements ProductService{
private ProductDao dao = new ProductDaoImpl();
	
	@Override
	public List<Product> getProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public Product getProductByName(String name) {
		return dao.getProductByName(name);
	}

}
