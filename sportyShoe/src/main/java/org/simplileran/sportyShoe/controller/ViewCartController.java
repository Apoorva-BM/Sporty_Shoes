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
import javax.servlet.http.HttpSession;

import org.simplileran.sportyShoe.entity.CartItem;
import org.simplileran.sportyShoe.service.CartService;
import org.simplileran.sportyShoe.service.impl.CartServiceImpl;

@WebServlet("/viewCartServlet")
public class ViewCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CartService service =new CartServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		List<CartItem> cartItem = service.getCartItem();
		if(!cartItem.isEmpty()) {
			session.setAttribute("cartItem", cartItem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("viewCart.jsp");
	        dispatcher.forward(request, response);
		}else
		{
			request.setAttribute("msg", "Error");
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
	        dispatcher.forward(request, response);
		}
		
	}

}
