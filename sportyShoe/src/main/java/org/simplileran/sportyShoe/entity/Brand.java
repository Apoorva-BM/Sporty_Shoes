package org.simplileran.sportyShoe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	private String brandName;
	
	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public Brand(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	

	@Override
	public String toString() {
		return brandName;
	}
	
	
}
