package comunidadIT.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comunidadIT.model.Product;
import comunidadIT.service.ProductService;

public class ProductController extends HttpServlet {
	// private ProductService ps = new ProductService();
	// private RequestDispatcher rd = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// processRequest(request,response);
		HttpSession session = request.getSession(false);
		// String forward="";
		String action = request.getParameter("action");
		ProductService ps = new ProductService();
		RequestDispatcher rd = null;
		if (session.getAttribute("role") != null) {
			if (session.getAttribute("role").equals("admin")) {
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
				case "update":
					int id3 = Integer.parseInt(request.getParameter("id"));
					request.setAttribute("product", ps.getProduct(id3));
					rd = request.getRequestDispatcher("/WEB-INF/updateProduct.jsp");
					rd.forward(request, response);
					break;
				case "updateDB":
					int id4 = Integer.parseInt(request.getParameter("cod"));
					String name1 = request.getParameter("name");
					String description1 = request.getParameter("description");
					double price1 = Double.parseDouble(request.getParameter("price"));
					ps.updateProduct(id4, name1, description1, price1);
					request.setAttribute("product", ps.getProducts());
					rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
					rd.forward(request, response);
					break;
				default:
					System.out.println("ERROR: En ProductController doGET");
				}
			} else if (session.getAttribute("role").equals("client")) {
				if(action.equals("see")){
					request.setAttribute("product", ps.getProducts());
					rd = request.getRequestDispatcher("/WEB-INF/listProductsClient.jsp");
					rd.forward(request, response);
				}
			} 
		}else {
			request.setAttribute("product", ps.getProducts());
			rd = request.getRequestDispatcher("/WEB-INF/listProductsUser.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse responser)
			throws ServletException, IOException {
		// processRequest(request,responser);

		ProductService ps = new ProductService();
		RequestDispatcher rd = null;
		// List<Product> product = ps.getProductos();
		request.setAttribute("product", ps.getProducts());
		rd = request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
		rd.forward(request, responser);
	}
	/*
	 * protected void processRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * String accion = request.getParameter("accion"); if (accion == null) {
	 * this.seeProduct(request, response); } else if (accion.equals("add")) {
	 * this.addProduct(request, response); } else if (accion.equals("new")) {
	 * this.newProduct(request, response); } else if (accion.equals("delete")) {
	 * this.deleteProduct(request, response); } else if
	 * (accion.equals("update")) { this.updateProduct(request, response); } }
	 */
	/*
	 * protected void seeProduct(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * request.setAttribute("product", ps.getProducts()); rd =
	 * request.getRequestDispatcher("/WEB-INF/listProducts.jsp");
	 * rd.forward(request, response); }
	 * 
	 * protected void addProduct(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { rd =
	 * request.getRequestDispatcher("/WEB-INF/addProduct.jsp");
	 * rd.forward(request, response); seeProduct(request, response); }
	 * 
	 * protected void newProduct(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { int id =
	 * Integer.parseInt(request.getParameter("cod")); String name =
	 * request.getParameter("name"); String description =
	 * request.getParameter("description"); double price =
	 * Double.parseDouble(request.getParameter("price")); ps.addProduct(id,
	 * name, description, price); }
	 * 
	 * protected void deleteProduct(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException { int
	 * id = Integer.parseInt(request.getParameter("id")); ps.deleteProduct(id);
	 * seeProduct(request, response); }
	 * 
	 * protected void updateProduct(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException { int
	 * id = Integer.parseInt(request.getParameter("id"));
	 * request.setAttribute("producto", ps.getProduct(id)); rd =
	 * request.getRequestDispatcher("/WEB-INF/updateProduct.jsp");
	 * rd.forward(request, response); }
	 */
}
