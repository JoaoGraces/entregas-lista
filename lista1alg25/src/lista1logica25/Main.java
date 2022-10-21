package lista1logica25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double altura, raio, volume;
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		volume = 3.14159 * Math.pow(raio, 2) * altura;

		System.out.printf("Volume: %.2f", volume);
				
		sc.close();
	}

}
