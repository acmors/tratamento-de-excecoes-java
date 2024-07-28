package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entitites.Product;

public class ProductManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		 List<Product> list = new ArrayList<>();
		  try {
			   System.out.println("Nome do produto: ");
			   String name = scan.nextLine();
			   System.out.println("Preço do produto: ");
			   double price = scan.nextDouble();
			   
			   Product product = new Product(name, price);
			   
			   System.out.println(product);
		  }
		  catch(IllegalArgumentException e) {
			  System.out.println("Ocorreu um erro: " + e.getMessage());
		  }
		  catch(InputMismatchException e) {
			  System.out.println("Erro de entrada: Por favor, insira um número válido para o preço.");
		  }
		  finally {
			  scan.close();
			  System.out.println("FIM.");
			  
		  }
	}

}
