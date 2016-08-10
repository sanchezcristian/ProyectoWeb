package comunidadIT.model;

public class Item {

	private Product product;
	private int quantity;
	private double subtotal;

	public double getSubtotal() {
		return (product.getPrice() * quantity);
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
