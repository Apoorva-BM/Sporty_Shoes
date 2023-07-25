package org.simplileran.sportyShoe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.simplileran.sportyShoe.entity.User;
import org.simplileran.sportyShoe.model.UserModel;
import org.simplileran.sportyShoe.service.UserService;
import org.simplileran.sportyShoe.service.impl.UserServiceImpl;

@WebServlet("/changepwd")
public class ChangePwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String email=request.getParameter("userEmail");
		UserModel model = new UserModel();
		model.setUserName(username);
		model.setUserEmail(email);
		User user=userService.getPwdUser(username, email);
		if(user!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("ChangePwd.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("password.jsp");
			request.setAttribute("msg", "Username/Password is invalid");
			rd.forward(request, response);
		}
	}

}
