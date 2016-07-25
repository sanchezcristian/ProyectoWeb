package comunidadIT.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comunidadIT.service.LoginService;

public class LoginController extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse responser) 
					throws ServletException, IOException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		LoginService userLogin = new LoginService();
		if(userLogin.checkUser(username, password)){
			rd = request.getRequestDispatcher("/WEB-INF/success.jsp");
			request.setAttribute("user", username);
		}else rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
		rd.forward(request, responser);
	}

}
