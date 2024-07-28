package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			int[] numbers = new int[] {10,20,30,40,50};
			System.out.println("Enter a number: ");
			int n = scan.nextInt();
		}
		catch(InputMismatchException e){
			//vai tratar o erros capturados no bloco TRY.
			System.out.println("Error: " + e.getMessage()); // -> exibe a o erro que foi lançado.
			System.out.println("Invalid input. Enter just integers characters!");
		}

	}

}
