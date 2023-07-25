package org.simplileran.sportyShoe.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	private String street;

	private String city;
	
	private String country;
	
	private String state;
	
	private String postalCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int addressId, String street, String city, String country, String state, String postalCode) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.postalCode = postalCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
