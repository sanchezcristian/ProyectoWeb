package comunidadIT.model;

public class Product {

	private int cod;
	private String name;
	private String description;
	private double price;

	public Product(int cod, String name, String description, double price) {
		this.cod = cod;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Product() {

	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
