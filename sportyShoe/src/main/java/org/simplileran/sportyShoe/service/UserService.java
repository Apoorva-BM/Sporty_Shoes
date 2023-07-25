package org.simplileran.sportyShoe.service;

import org.simplileran.sportyShoe.entity.User;
import org.simplileran.sportyShoe.model.UserModel;

public interface UserService {

	void addUser(UserModel user);
	User getUser(String userName, String userPwd);
	User getPwdUser(String userName,String userEmail);
	void changePwd(String userName,String userPwd );
}
