package lista1logica7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		System.out.println("O número seguinte é " + (n1 + 1) + " e o antcessor é " + (n1 - 1));
		
		sc.close();
	}

}
