package org.simplileran.sportyShoe.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplileran.sportyShoe.config.HibConfig;
import org.simplileran.sportyShoe.dao.UserDao;
import org.simplileran.sportyShoe.entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public void insertUser(User user) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		
	}

	@Override
	public User get(String userName, String userPwd) {
		SessionFactory factory=null;
		Session session=null;
		Query<User> query=null;
		User user=null;
		try
		{
		factory=HibConfig.getSessionFactory();
		session=factory.openSession();
		query=session.createQuery("select u from org.simplileran.sportyShoe.entity.User u where u.userName=?1 and u.password=?2");
		query.setParameter(1, userName);
		query.setParameter(2, userPwd);
		user=query.uniqueResult();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return user;
	}

	@Override
	public User getPwd(String userName,String userEmail) {
		SessionFactory factory=null;
		Session session=null;
		Query<User> query=null;
		User user=null;
		try
		{
		factory=HibConfig.getSessionFactory();
		session=factory.openSession();
		query=session.createQuery("select u from org.simplileran.sportyShoe.entity.User u where u.userName=?1 and u.email=?2");
		query.setParameter(1, userName);
		query.setParameter(2, userEmail);
		user=query.uniqueResult();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return user;
	}

	@Override
	public void updatePwd(String userName, String newPassword) {
		SessionFactory factory=null;
		Session session=null;
		User user = null;
		Transaction transaction = null;
		try
		{
	    factory=HibConfig.getSessionFactory();
		session=factory.openSession();
		transaction = session.beginTransaction();
		user = session.createQuery("from org.simplileran.sportyShoe.entity.User u where u.userName=?1 ", User.class)
                .setParameter(1, userName)
                .uniqueResult();
		if (user != null) {
            user.setPassword(newPassword);
            session.saveOrUpdate(user);
            transaction.commit();
		}}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

}


