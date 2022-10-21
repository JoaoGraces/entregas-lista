package lista1logica21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, h;
		
		System.out.println("Digite o valor da base: ");
		b = sc.nextInt();
		System.out.println("Digite o valor da altura: ");
		h = sc.nextInt();
		
		a = (b * h) / 2;
		
		System.out.println("Área: " + a);
		
		sc.close();

	}

}
