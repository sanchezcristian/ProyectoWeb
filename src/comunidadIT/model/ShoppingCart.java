package comunidadIT.model;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> shoppingCart;
	private double total;
	
	public int getLineItemCount (){
		return (shoppingCart.size());
	}
	
	//FIXME como parametro debe resivir el id del producto
	public void deleteItem (int idItem){
		for (int i=0; i < shoppingCart.size(); i++){
			if(getItemById(i).getProduct().getCod() == idItem){
				
			}
		}
	}
	
	public Item getItemById (int idItem){
		for (int i=0; i < shoppingCart.size(); i++){
			if(shoppingCart.get(i).getProduct().getCod() == idItem){
				return (shoppingCart.get(i));
			}
		}
		return null;
	}
	
	public void addItem (Item item){
		for (int i=0; i < shoppingCart.size(); i++){
			Item it = shoppingCart.get(i);
			if(it.getProduct().getCod() == item.getProduct().getCod()){
				it.setQuantity(it.getQuantity() + item.getQuantity());
			}else shoppingCart.add(item);
		}
	}

	public void deleteItem (Item item){
		for (int i=0; i < shoppingCart.size(); i++){
			Item it = shoppingCart.get(i);
			if (it.getProduct().getCod() == item.getProduct().getCod()){
				shoppingCart.remove(i);
			}
		}
	}
	
	public void calculateTotal(){
		for (int i=0; i < shoppingCart.size(); i++ ){
			total+= shoppingCart.get(i).getSubtotal();
		}
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ArrayList<Item> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<Item> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
}
