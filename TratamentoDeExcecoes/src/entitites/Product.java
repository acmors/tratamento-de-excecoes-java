package entitites;

import java.util.InputMismatchException;

public class Product {

	private String name;
	private double price;
	
	public Product() {
		
	}

	public Product( String name, double price) {
        if (price < 0) {
            throw new InputMismatchException("O preço deve ser numerico.");
        }
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
        if (price < 0) {
            throw new InputMismatchException("O preço deve ser numerico.");
        }
		this.price = price;
	}
	
    @Override
    
    public String toString() {
        return "Product Data: " +
               " name: " + name + " " +
               ", price: " + price;
    }
}
