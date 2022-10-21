package lista1logica14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double saldo, rea;
		
		System.out.println("Digite o saldo atual: ");
		saldo = sc.nextDouble();
		
		rea = saldo * (1/100);
		saldo = saldo + rea;
		
		System.out.println("Reajuste de 1%: " + saldo);
		
		
		sc.close();

	}

}
