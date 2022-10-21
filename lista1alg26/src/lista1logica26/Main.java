package lista1logica26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tempo, taxa, valor, calculo;
		
		System.out.println("Digite o valor do tempo: ");
		tempo = sc.nextInt();
		System.out.println("Digite o valor da taxa: ");
		taxa = sc.nextInt();
		System.out.println("Digite o valor: ");
		valor = sc.nextInt();
		
		calculo = valor+(valor*(taxa/100)*tempo);
		
		System.out.println("Valor da prestação em atraso: " + calculo);
		
		sc.close();
	}

}
