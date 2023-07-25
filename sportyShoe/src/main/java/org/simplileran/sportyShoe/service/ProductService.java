package org.simplileran.sportyShoe.service;

import java.util.List;

import org.simplileran.sportyShoe.entity.Product;

public interface ProductService {
 List<Product> getProduct();
 Product getProductByName(String name);
}
