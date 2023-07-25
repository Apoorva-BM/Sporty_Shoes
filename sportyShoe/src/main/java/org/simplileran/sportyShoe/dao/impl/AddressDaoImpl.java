package org.simplileran.sportyShoe.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplileran.sportyShoe.config.HibConfig;
import org.simplileran.sportyShoe.dao.AddressDao;
import org.simplileran.sportyShoe.entity.Address;
import org.simplileran.sportyShoe.entity.User;

public class AddressDaoImpl implements AddressDao{

	@Override
	public void insertAddress(Address address) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(address);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		
		
	}



}
