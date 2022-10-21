package lista1logica19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int l, a, p;
		double d;
		
		System.out.println("Digite o valor do lado do quadrado: ");
		l = sc.nextInt();
		
		a = l * l;
		p = l + l + l + l;
		d = l * Math.sqrt(2);
		
		System.out.println("Perímetro: " + p);
		System.out.println("Área: " + a);
		System.out.printf("Diagonal: %.2f", d );
		
		sc.close();
	}

}
