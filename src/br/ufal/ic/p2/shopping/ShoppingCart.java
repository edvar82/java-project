package br.ufal.ic.p2.shopping;

import java.util.ArrayList;

public class ShoppingCart {
	
	private Customer client; 
	private ArrayList<Product> productsList;
	
	public ShoppingCart(Customer client) {
		this.client = client;
		this.productsList = new ArrayList<Product>();
	}
	
	public void addProduct(Product produto) {
		this.productsList.add(produto);
	}
	
	public void removeProduct(Product produto) {
		this.productsList.remove(produto);
	}
	
	public String getContents() {
		String saida = "";
		for(Product item : productsList) {
			saida += item.getName() + "\n";
		}
		return saida;
	}	
	
	public int getCustomerID() {
		return client.getId();
	}
	
	public int getItemCount() {
		return productsList.size();
	}
	
	public double getTotalPrice() {
		double preco = 0;
		for(Product val : productsList) {
			preco += val.getPrice();
		}
		return preco;
	}
	
}


