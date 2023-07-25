package org.simplileran.sportyShoe.service.impl;

import java.util.List;

import org.simplileran.sportyShoe.dao.AddCartDao;
import org.simplileran.sportyShoe.dao.impl.AddCartDaoImpl;
import org.simplileran.sportyShoe.entity.CartItem;
import org.simplileran.sportyShoe.model.CartModel;
import org.simplileran.sportyShoe.service.CartService;

public class CartServiceImpl implements CartService{
private AddCartDao dao = new AddCartDaoImpl();
private CartItem cart=new CartItem();
	
	@Override
	public void addToCart(CartModel model) {
		cart.addProduct(model.getProduct());
		cart.setQuantity(model.getQuantity());
		dao.addToCart(cart);
	}

	@Override
	public List<CartItem> getCartItem() {
		return dao.getCartItem();
	}

}
