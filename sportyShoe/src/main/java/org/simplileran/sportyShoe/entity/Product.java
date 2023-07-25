package org.simplileran.sportyShoe.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	private String productName;
	
	private String description;
	
	private int price;
	
	private int quantity;
	
	private String imageUrl;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	@ManyToMany(mappedBy = "product")
    private List<CartItem> cart = new ArrayList<>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String description, int price, int quantity, String imageUrl,
			Category category, Brand brand, List<CartItem> cart) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.imageUrl = imageUrl;
		this.category = category;
		this.brand = brand;
		this.cart = cart;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<CartItem> getCart() {
		return cart;
	}

	public void setCart(List<CartItem> cart) {
		this.cart = cart;
	}
	
	  @Override
	    public String toString() {
	    	return 
//	    			"productName=" + 
	    			productName;
//	    	"description ="+ description+
//			"price = "+ price+
//			"quantity ="+ quantity +
//			"imageUrl =" + imageUrl+
//			"category ="+ category+
//			"brand ="+ brand+
//			"cart = "+ cart;
	    	
	    }
}
