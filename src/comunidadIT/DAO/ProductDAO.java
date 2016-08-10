package comunidadIT.DAO;

import java.sql.ResultSet;

import comunidadIT.model.Product;

public class ProductDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public void add(Product product) {
		String query = "INSERT INTO product (id,name, description, price) " + "VALUES (" + product.getCod() + ",'"
				+ product.getName() + "','" + product.getDescription() + "'," + product.getPrice() + ");";
		connDB.setQuery(query);
	}

	public ResultSet getProduct() {
		String query = "SELECT * FROM product;";
		return connDB.getQuery(query);
	}

	public ResultSet getProduct(int id) {
		String query = "SELECT * FROM product WHERE id=" + id + ";";
		return connDB.getQuery(query);
	}

	public void deleteProduct(int cod) {
		String query = "DELETE FROM product where id=" + cod + ";";
		connDB.setQuery(query);
	}

	public void updateProduct(Product product){
		String query = "UPDATE product SET  name='" + product.getName() 
		+ "',description='"+ product.getDescription() + "',price="
				+ product.getPrice() + " WHERE id=" + product.getCod() + ";";
		connDB.setQuery(query);
	}

}
