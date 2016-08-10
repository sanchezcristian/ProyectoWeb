package comunidadIT.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comunidadIT.service.UserService;

public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse responser)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;

		UserService userService = new UserService();
		if (userService.existUser(username, password)) {
			request.getSession().setAttribute("username", username);
			if (userService.isAdmin(username)) {
				request.getSession().setAttribute("role", "admin");
				rd = request.getRequestDispatcher("/WEB-INF/admin.jsp");
			} else {
				request.getSession().setAttribute("role", "client");
				rd = request.getRequestDispatcher("/WEB-INF/success.jsp");
			}
		} else
			rd = request.getRequestDispatcher("/WEB-INF/error.jsp");
		rd.forward(request, responser);
	}

}
