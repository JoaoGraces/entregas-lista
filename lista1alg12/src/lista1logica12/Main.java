package lista1logica12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Digite um número real: ");
		n1 = sc.nextDouble();
		System.out.println("Digite outro número real: ");
		n2 = sc.nextDouble();
		
		System.out.println("Média: " + (n1+n2)/2);
		sc.close();
		
	}

}
