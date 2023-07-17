package br.ufal.ic.p2.shopping;

public class Main {
	public static void main(String[] args) {
		Product produto1 = new Product("Arroz", 120);
		Product produto2 = new Product("Feijão", 100);
		
		Customer cliente1 = new Customer(1,"Paulinho","Rua 1");
		Customer cliente2 = new Customer(2,"Edvar","Rua 2");
		Customer cliente3 = new Customer(3,"Anthony","Rua 3");
		
		ShoppingCart carrinho1 = new ShoppingCart(cliente1);
		ShoppingCart carrinho2 = new ShoppingCart(cliente2);
		ShoppingCart carrinho3 = new ShoppingCart(cliente3);
		
		carrinho1.addProduct(produto1);
		carrinho1.addProduct(produto2);
		
		System.out.println(carrinho1.getTotalPrice());
		System.out.println(carrinho1.getContents());
	}
}
