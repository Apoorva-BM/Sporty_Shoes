package org.simplileran.sportyShoe.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class CartItem implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	@ManyToMany
    @JoinTable(
        name = "cart_item",
        joinColumns = @JoinColumn(name = "cart_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> product = new ArrayList<>();
	
	private int quantity;
	
	public CartItem() {
		// TODO Auto-generated constructor stub
	}

	public CartItem(int cartId, List<Product> products, int quantity) {
		super();
		this.cartId = cartId;
		this.product = products;
		this.quantity = quantity;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addProduct(Product product) {
		if (product != null) {
		this.product.add(product);
        product.getCart().add(this);}
    }

    public void removeProduct(Product product) {
    	if (product != null) {this.product.remove(product);
        product.getCart().remove(this);}
    }
	
//    public int getProductId() {
//        return product.g;
//    }
	
}
