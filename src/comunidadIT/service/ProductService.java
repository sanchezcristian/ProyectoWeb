package comunidadIT.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import comunidadIT.DAO.ProductDAO;
import comunidadIT.model.Product;

public class ProductService {

	private ArrayList<Product> listProduct = new ArrayList<Product>();
	private ProductDAO productDAO = new ProductDAO();

	public ArrayList<Product> getProducts() {
		try {
			ResultSet rs = productDAO.getProduct();
			while (rs.next()) {
				Product product = new Product();
				product.setCod(rs.getInt("id"));
				System.out.println(product.getCod());
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
	
	public Product getProduct(int id){
		Product product = new Product();
		try {
			ResultSet rs = productDAO.getProduct();
			rs.next();
			product.setCod(id);
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setPrice(rs.getDouble("price"));
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return product;
	}
	
	public void deleteProduct(int id){
		productDAO.deleteProduct(id);		
	}
	
	
	public void addProduct (int id, String name, String description, double price){
		Product product = new Product(id, name, description , price);
		productDAO.add(product);		
	}
	
	public void updateProduct (int id, String name, String description, double price){
		Product product = new Product(id, name, description , price);
		productDAO.updateProduct(product);	
	}


}
