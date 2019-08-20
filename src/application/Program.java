package application;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("type the product name: ");
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity of product: "));
		double price = Double.parseDouble(JOptionPane.showInputDialog("Price per unity of product: "));
		Product p = new Product(name, price, quantity);

		System.out.println("Date");
		System.out.println(p);
		
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Addiional quantity of product: "));
		p.addProduct(quantity);
		
		System.out.println("===============");
		System.out.println("UpDate");
		System.out.println(p);
		
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Remove quantity of product: "));
		p.addProduct(quantity);
		
		System.out.println("===============");
		System.out.println("UpDate 2");
		System.out.println(p);
		
	}

}
