package org.simplileran.sportyShoe.service;

import java.util.List;

import org.simplileran.sportyShoe.entity.CartItem;
import org.simplileran.sportyShoe.entity.Product;
import org.simplileran.sportyShoe.model.CartModel;

public interface CartService {

	void addToCart(CartModel model);
	List<CartItem> getCartItem();
}
