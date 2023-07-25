package org.simplileran.sportyShoe.dao;

import java.util.List;

import org.simplileran.sportyShoe.entity.CartItem;

public interface AddCartDao {

	void addToCart(CartItem item);
	List<CartItem> getCartItem();
}
