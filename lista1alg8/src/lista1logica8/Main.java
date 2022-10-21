package lista1logica8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String nome, endereco;
		int tel;
		
		System.out.print("Digite o nome: ");
		nome = sc.nextLine();
		System.out.print("Digite o telefone: ");
		tel = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o endereço: ");
		endereco = sc.nextLine();
		
		
		System.out.printf("Nome: %s\nTelefone:%d\nEndereço:%s", nome, tel, endereco);
		
		sc.close();

	}

}
