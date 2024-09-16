package br.com.serratec.connction;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.com.serratec.dao.ClienteDao;
import br.com.serratec.entity.Cliente;

public class TesteInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nome:");
		String nome = sc.next();
		System.out.println("Telefone:");
		String telefone = sc.next();
		System.out.println("Email:");
		String email = sc.next();
		
		Cliente cliente = new Cliente(null, nome, telefone, email);
		
		ClienteDao  dao = new ClienteDao();
		dao.inserir(cliente);
	}
}
