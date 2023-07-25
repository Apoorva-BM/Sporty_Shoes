package org.simplileran.sportyShoe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplileran.sportyShoe.model.AddressModel;
import org.simplileran.sportyShoe.model.UserModel;
import org.simplileran.sportyShoe.service.AddressService;
import org.simplileran.sportyShoe.service.UserService;
import org.simplileran.sportyShoe.service.impl.AddressServiceImpl;
import org.simplileran.sportyShoe.service.impl.UserServiceImpl;
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();
	private AddressService addressService = new AddressServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String phoneNumber=request.getParameter("phoneNumber");
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String postalCode=request.getParameter("postalCode");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		AddressModel addressModel = new AddressModel(street,city,state,country,postalCode);
		UserModel userModel=new UserModel(username, password, email,firstName,lastName,phoneNumber,addressModel);
		addressService.addAddress(addressModel);
		userService.addUser(userModel);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
