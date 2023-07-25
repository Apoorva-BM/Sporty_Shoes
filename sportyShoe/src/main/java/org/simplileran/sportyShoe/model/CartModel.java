package org.simplileran.sportyShoe.model;

import java.util.List;

import org.simplileran.sportyShoe.entity.Product;

public class CartModel {

	private Product product;
	private int quantity;
	
	public CartModel() {
		// TODO Auto-generated constructor stub
	}

	public CartModel(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
