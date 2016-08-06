package comunidadIT.DAO;

import comunidadIT.model.Product;

public class ProductDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public void add(Product product) {
		String consul = "INSERT INTO producto (name, description, price) " + "VALUES (" + product.getName() + "; "
				+ product.getDescription() + "; " + product.getPrice() + ")";
		connDB.setQuery(consul);
	}

}
