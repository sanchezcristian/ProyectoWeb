package comunidadIT.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comunidadIT.model.Product;
import comunidadIT.service.ProductService;

public class PorductController extends HttpServlet {
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       // String forward="";
		  ProductService ps = new ProductService();
	    	RequestDispatcher rd = null;
	    	//String action = request.getParameter("action");
            request.setAttribute("product", ps.getProductos());
            rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
            rd.forward(request, response);
	    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse responser)
			throws ServletException, IOException {

		ProductService ps = new ProductService();
		RequestDispatcher rd = null;
		//List<Product> product = ps.getProductos();
		request.setAttribute("product", ps.getProductos());
		rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
		rd.forward(request, responser);
	}
}
