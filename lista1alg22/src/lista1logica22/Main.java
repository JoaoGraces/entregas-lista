package lista1logica22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dzao, d, a;
		
		System.out.println("Digite a diagonal maior: ");
		dzao = sc.nextInt();
		System.out.println("Digite o valor da diagonal: ");
		d = sc.nextInt();
		
		a = (dzao * d)/2; 
		
		System.out.println("Área: " + a);
		
		sc.close();

	}

}
