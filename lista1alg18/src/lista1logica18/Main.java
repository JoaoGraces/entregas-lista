package lista1logica18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, perimetro;
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = sc.nextInt();

		area = 3.14 * (Math.pow(raio, 2));
		perimetro = 2*3.14 * raio;
		
		System.out.printf("Perímetro: %.2f", perimetro);
		System.out.printf("\nÁrea: %.2f", area);
	}

}
