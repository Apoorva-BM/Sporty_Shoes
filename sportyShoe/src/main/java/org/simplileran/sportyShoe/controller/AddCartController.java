package org.simplileran.sportyShoe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplileran.sportyShoe.entity.CartItem;
import org.simplileran.sportyShoe.entity.Product;
import org.simplileran.sportyShoe.model.CartModel;
import org.simplileran.sportyShoe.service.CartService;
import org.simplileran.sportyShoe.service.ProductService;
import org.simplileran.sportyShoe.service.impl.CartServiceImpl;
import org.simplileran.sportyShoe.service.impl.ProductServiceImpl;
@WebServlet("/addToCartServlet")
public class AddCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
private ProductService service = new ProductServiceImpl();
private CartService addCart = new CartServiceImpl();
private CartModel model = new CartModel();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String productName = request.getParameter("productName");
		String quantity =  request.getParameter("quantity");
		int quantities =Integer.parseInt(quantity);
		Product product = service.getProductByName(productName);
		if(product!=null) {
			List<CartItem> carts=addCart.getCartItem();
			if(!carts.isEmpty()) {
				CartModel model = new CartModel(product,quantities);
				addCart.addToCart(model);
			}else if(!carts.contains(product)) {
				addCart.addToCart(model);
	        }
		}
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

}
