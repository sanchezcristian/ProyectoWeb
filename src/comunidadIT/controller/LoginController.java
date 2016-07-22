package comunidadIT.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse responser) 
					throws ServletException, IOException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		if(username.equalsIgnoreCase("cristian") && password.equalsIgnoreCase("1234")){
			rd = request.getRequestDispatcher("/WEB-INF/success.jsp");
		}else rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
		rd.forward(request, responser);
	}

}
