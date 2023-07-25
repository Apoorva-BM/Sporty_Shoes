package org.simplileran.sportyShoe.model;

public class UserModel {
	private String userName;
	private String userPwd;
	private String userEmail;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private AddressModel model;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public UserModel(String userName, String userPwd, String userEmail, String firstName, String lastName,
			String phoneNumber,AddressModel model) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userEmail = userEmail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.model=model;
	}

	public AddressModel getModel() {
		return model;
	}

	public void setModel(AddressModel model) {
		this.model = model;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
