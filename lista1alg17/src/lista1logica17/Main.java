package lista1logica17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area, perimetro;
		double diagonal;
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextInt();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextInt();
		
		area = base * altura;
		perimetro = base + altura + base + altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
		System.out.printf("Diagonal: %.2f", diagonal);
		
		sc.close();
	}

}
