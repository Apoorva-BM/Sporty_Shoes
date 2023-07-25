package org.simplileran.sportyShoe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/placeOrderServlet")
public class PlaceOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String cardNumber = request.getParameter("cardNumber");
	    String expirationDate = request.getParameter("expirationDate");
	    request.setAttribute("cardNumber", cardNumber);
	    request.setAttribute("expirationDate", expirationDate);
	    Boolean paymentProcessed = true;
	    request.setAttribute("paymentProcessed", paymentProcessed);
	    request.getRequestDispatcher("/placeOrder.jsp").forward(request, response);
	}

}
