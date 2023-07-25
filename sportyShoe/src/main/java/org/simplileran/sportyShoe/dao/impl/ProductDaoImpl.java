package org.simplileran.sportyShoe.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simplileran.sportyShoe.config.HibConfig;
import org.simplileran.sportyShoe.dao.ProductDao;
import org.simplileran.sportyShoe.entity.Product;

public class ProductDaoImpl implements ProductDao{

	@Override
	public List<Product> getAllProduct() {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		List<Product> product = new ArrayList<>();
		//Product prod =new Product();
		try {
			factory=HibConfig.getSessionFactory();
			session=factory.openSession();
			product = session.createQuery("FROM org.simplileran.sportyShoe.entity.Product p", Product.class)
	                .getResultList();
			System.out.println("the product detail" + product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public Product getProductByName(String name) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Product product = new Product();
		try {
			factory=HibConfig.getSessionFactory();
			session=factory.openSession();
			product = session.createQuery("FROM org.simplileran.sportyShoe.entity.Product p where p.productName=?1", Product.class)
					.setParameter(1, name)
					.uniqueResult();
			System.out.println("the product detail" + product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
