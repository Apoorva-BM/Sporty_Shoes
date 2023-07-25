package org.simplileran.sportyShoe.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.simplileran.sportyShoe.entity.Address;
import org.simplileran.sportyShoe.entity.Brand;
import org.simplileran.sportyShoe.entity.CartItem;
import org.simplileran.sportyShoe.entity.Category;
import org.simplileran.sportyShoe.entity.OrderEntity;
import org.simplileran.sportyShoe.entity.Product;
import org.simplileran.sportyShoe.entity.User;

public class HibConfig {
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/sportydb");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "roots");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.FORMAT_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Address.class);
		configuration.addAnnotatedClass(Brand.class);
		configuration.addAnnotatedClass(CartItem.class);
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Category.class);
		configuration.addAnnotatedClass(OrderEntity.class);
		configuration.addAnnotatedClass(User.class);
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}
}
