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

public class ProductController extends HttpServlet {
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       // String forward="";
		  ProductService ps = new ProductService();
	    	RequestDispatcher rd = null;
	    	String action = request.getParameter("action");
	    	switch (action) {
	    	case "see":
	            request.setAttribute("product", ps.getProducts());
	            rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
	            rd.forward(request, response);
	            break;
	    	case "add":
	            rd = request.getRequestDispatcher("/WEB-INF/addProduct.jsp");
	            rd.forward(request, response);
	            break;
	    	case "new":
	    		int id2 = Integer.parseInt(request.getParameter("cod"));
	    		String name = request.getParameter("name");
	    		String description = request.getParameter("description");
	    		double price = Double.parseDouble(request.getParameter("price"));
	    		ps.addProduct(id2, name, description, price);
	    		request.setAttribute("product", ps.getProducts());
	            rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
	            rd.forward(request, response);
	            break;
	    	case "delete":
	    		int id = Integer.parseInt(request.getParameter("id"));
	    		ps.deleteProduct(id);
    			request.setAttribute("product", ps.getProducts());
		    	rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
	            rd.forward(request, response);
	    		break;
	    	default:
				System.out.println("ERROR: En ProductController doGET");
	    	}
	  }

	protected void doPost(HttpServletRequest request, HttpServletResponse responser)
			throws ServletException, IOException {
		
		ProductService ps = new ProductService();
		RequestDispatcher rd = null;
		//List<Product> product = ps.getProductos();
		request.setAttribute("product", ps.getProducts());
		rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
		rd.forward(request, responser);
		
	}
}
