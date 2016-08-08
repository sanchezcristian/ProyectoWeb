package comunidadIT.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import comunidadIT.DAO.ProductDAO;
import comunidadIT.model.Product;

public class ProductService {

	private ArrayList<Product> listProduct = new ArrayList<Product>();
	private ProductDAO productDAO = new ProductDAO();

	public ArrayList<Product> getProductos() {
		try {
			ResultSet rs = productDAO.getProduct();
			while (rs.next()) {
				Product product = new Product();
				product.setName(rs.getString("name"));
				System.out.println(product.getName());
				product.setDescription(rs.getString("description"));
				System.out.println(product.getDescription());
				product.setPrice(rs.getDouble("price"));
				System.out.println(product.getPrice());
				listProduct.add(product);
				System.out.println("Hola");
				
			}
		} catch (SQLException e) {
			System.out.println("ERROR: en añadir el rpducto a la lista en ProductService");
			e.printStackTrace();
		}
		return listProduct;
	}

}
