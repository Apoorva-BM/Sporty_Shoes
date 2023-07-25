package org.simplileran.sportyShoe.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne
	@JoinColumn( name = "use_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "orderItem")
	private CartItem cart;
	
	private Date orderDate;
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	private int amount;
	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
	
	public OrderEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderEntity(int orderId, User user, CartItem cart, Date orderDate, Address address, int amount,
			Category category) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.cart = cart;
		this.orderDate = orderDate;
		this.address = address;
		this.amount = amount;
		this.category = category;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CartItem getCart() {
		return cart;
	}

	public void setCart(CartItem cart) {
		this.cart = cart;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
//	public void addCategory(Category category) {
//		this.category.add(category);
//	}
//	
//	public void removeCategory(Category category) {
//		this.category.remove(category);
//		//category.setUser(null);
//	}
	
}
