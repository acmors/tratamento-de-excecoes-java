package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a: ");
			int a = scan.nextInt();
			System.out.println("Enter b: ");
			int b = scan.nextInt();
			
			int result = a / b;
			
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalit operation. It is not possible to divide an integer by zero.");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter just Integer values.");
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			scan.close();
			System.out.println("END.");
		}
	}

}
