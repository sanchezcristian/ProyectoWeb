package comunidadIT.DAO;

import java.sql.ResultSet;

import comunidadIT.model.Product;

public class ProductDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public void add(Product product) {
		String query = "INSERT INTO producto (name, description, price) " + "VALUES (" + product.getName() + "; "
				+ product.getDescription() + "; " + product.getPrice() + ")";
		connDB.setQuery(query);
	}

	public ResultSet getProduct() {
		String query = "SELECT * FROM product;";
		return connDB.getQuery(query);

	}

}
