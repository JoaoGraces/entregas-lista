package lista1logica20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, diagonal;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		
		diagonal = a*a + b*b + c*c;
		
		System.out.println("Diagonal: " + diagonal);
		
		sc.close();

	}

}
