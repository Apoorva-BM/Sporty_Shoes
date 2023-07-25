package org.simplileran.sportyShoe.service.impl;

import org.simplileran.sportyShoe.dao.UserDao;
import org.simplileran.sportyShoe.dao.impl.UserDaoImpl;
import org.simplileran.sportyShoe.entity.Address;
import org.simplileran.sportyShoe.entity.User;
import org.simplileran.sportyShoe.model.UserModel;
import org.simplileran.sportyShoe.service.AddressService;
import org.simplileran.sportyShoe.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao dao = new UserDaoImpl();
	private AddressService service = new AddressServiceImpl();
	
	@Override
	public void addUser(UserModel user) {
		User userEntity=new User();
		userEntity.setUserName(user.getUserName());
		userEntity.setPassword(user.getUserPwd());
		userEntity.setEmail(user.getUserEmail());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setPhoneNumber(user.getPhoneNumber());
		Address addressObj=service.getAddress(user.getModel());
		userEntity.setAddress(addressObj);
		dao.insertUser(userEntity);	
	}

	@Override
	public User getUser(String userName, String userPwd) {
		return dao.get(userName, userPwd);
	}

	@Override
	public User getPwdUser(String userName, String userEmail) {
		return dao.getPwd(userName,userEmail);
	}

	@Override
	public void changePwd(String userName, String userPwd) {
		dao.updatePwd(userName, userPwd);
	}

}
