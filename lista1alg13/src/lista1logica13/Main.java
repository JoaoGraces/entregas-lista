package lista1logica13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4;
		
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextInt();
		System.out.println("Digite o quarto número: ");
		n4 = sc.nextInt();
		
		System.out.println("Média ponderada: " + (1*n1+2*n2+3*n3+4*n4)/(1+2+3+4));
		
		sc.close();

	}

}
