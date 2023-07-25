package org.simplileran.sportyShoe.model;

public class LoginModel {

	private String userName;
	private String userPwd;
	
	public LoginModel() {
		// TODO Auto-generated constructor stub
	}

	public LoginModel(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}
