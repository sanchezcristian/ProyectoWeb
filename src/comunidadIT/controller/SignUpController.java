package comunidadIT.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comunidadIT.service.LoginService;
import comunidadIT.service.SignUpService;

public class SignUpController extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse responser) 
			throws ServletException, IOException{

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		SignUpService singUp = new SignUpService();
		if(!singUp.existUser(username, password)){
			rd = request.getRequestDispatcher("/WEB-INF/success.jsp");
			request.setAttribute("user", username);
		}else rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
		rd.forward(request, responser);
	}

}
