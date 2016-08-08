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

	protected void doPost(HttpServletRequest request, HttpServletResponse responser)
			throws ServletException, IOException {

		ProductService ps = new ProductService();
		RequestDispatcher rd = null;
		List<Product> product = ps.getProductos();
		request.setAttribute("product", product);
	

		rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");

		rd.forward(request, responser);
	}
}
