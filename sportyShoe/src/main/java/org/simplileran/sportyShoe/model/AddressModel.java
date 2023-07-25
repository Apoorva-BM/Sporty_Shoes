package org.simplileran.sportyShoe.model;

public class AddressModel {

	private String street;

	private String city;
	
	private String country;
	
	private String state;
	
	private String postalCode;
	
	public AddressModel() {
		// TODO Auto-generated constructor stub
	}

	public AddressModel(String street, String city, String country, String state, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
}
