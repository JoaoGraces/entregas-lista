package lista1logica10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Produto: " + n1*n2);
		
		
		sc.close();

	}

}
