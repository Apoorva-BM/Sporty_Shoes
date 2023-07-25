package org.simplileran.sportyShoe.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplileran.sportyShoe.config.HibConfig;
import org.simplileran.sportyShoe.dao.AddCartDao;
import org.simplileran.sportyShoe.entity.CartItem;

public class AddCartDaoImpl  implements AddCartDao{

	@Override
	public void addToCart(CartItem item) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(item);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
	}

	@Override
	public List<CartItem> getCartItem() {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		List<CartItem> item = new ArrayList<>();
		try {
			factory=HibConfig.getSessionFactory();
			session=factory.openSession();
			item = session.createQuery("FROM org.simplileran.sportyShoe.entity.CartItem p", CartItem.class)
	                .getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return item;
	}

}
