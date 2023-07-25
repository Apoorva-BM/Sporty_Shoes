package org.simplileran.sportyShoe.dao;

import org.simplileran.sportyShoe.entity.User;

public interface UserDao {
	void insertUser(User user);
	User get(String username,String password);
	User getPwd(String username,String userEmail);
	void updatePwd(String username,String password);
}
