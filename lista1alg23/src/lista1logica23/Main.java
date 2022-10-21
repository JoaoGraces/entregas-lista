package lista1logica23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite seu idade: ");
		idade = sc.nextInt();
		
		System.out.println("Nome:" + nome);
		System.out.println("Idade: " + idade);
		
		
		sc.close();
	}

}
