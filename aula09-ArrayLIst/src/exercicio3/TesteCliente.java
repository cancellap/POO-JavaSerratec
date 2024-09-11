package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o ID do cliente: (Valor negativo para sair) ");
			int id = sc.nextInt();
			if (id < 0) {
				break;
			}
			System.out.println("Digite o nome do cliente: ");
			String nome = sc.next();

			System.out.println("Digite a idade do cliente: ");
			int idade = sc.nextInt();

			System.out.println("Digite o telefone do cliente: ");
			String telefone = sc.next();
			
			Cliente cliente = new Cliente(id, nome, idade, telefone);
			clientes.add(cliente);
		}
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}

	}
}
