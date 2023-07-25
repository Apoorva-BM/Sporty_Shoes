package org.simplileran.sportyShoe.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@OneToMany(mappedBy = "category")
	private List<OrderEntity> orderEnty;
	 
	public Category() {
		
	}

	public Category(int categoryId, String name, Brand brand, List<OrderEntity> orderEnty) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.brand = brand;
		this.orderEnty = orderEnty;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public List<OrderEntity> getOrderEnty() {
		return orderEnty;
	}

	public void setOrderEnty(List<OrderEntity> orderEnty) {
		this.orderEnty = orderEnty;
	}
	
	public void addOrder(OrderEntity orderEntys) {
		orderEnty.add(orderEntys);
		//orderEnty.se(this);
    }

    public void removeOrder(OrderEntity orderEntys) {
    	orderEnty.remove(orderEntys);
    	//orderEnty.setCartItem(null);
    }
	
    @Override
    public String toString() {
    	return name;
    }
}
