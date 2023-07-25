package org.simplileran.sportyShoe.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplileran.sportyShoe.entity.Product;
import org.simplileran.sportyShoe.service.ProductService;
import org.simplileran.sportyShoe.service.impl.ProductServiceImpl;

@WebServlet("/products")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductService service= new ProductServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		List<Product> products = service.getProduct();
		if(!products.isEmpty()) {
		session.setAttribute("products", products);
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
        }
		else
		{
			request.setAttribute("msg", "Error");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	        dispatcher.forward(request, response);
		}
		
	}



}
