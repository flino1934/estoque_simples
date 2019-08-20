package entities;

public class Product {

	private String name;
	private Double price;
	private Integer quantity;

	public Product(String name, Double price, Integer quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void addProduct(int quantity) {
		
		this.quantity += quantity;
		
	}//Vai receber quantity por parametro e vai adicionar a quantidade no total em estoque 
	
	public void removeProduct(int quantity) {
		
		this.quantity -= quantity;
		
	}//Vai receber o parametro quantity e vai descontar da quantidade total de produtos em estoque
	
	public Double total() {
		return quantity*price;
	}//Vai calcular o valor de preço * quantidade e somar assim trazendo o valor total da compra
	
	@Override
	
	public String toString() {
		
		
		return"Name: "+name
				+"\nQuantity: "+quantity
				+"\nPrice per unit: "+price+"R$"
				+"\nTotal: "+total(); 
	}
	
}

	