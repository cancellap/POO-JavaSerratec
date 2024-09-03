package exercicios;

import javax.swing.JOptionPane;

public class SalarioExtra {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));

		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail: " + email);
		System.out.println("Salario: " + salario);
		System.out.println("Salario: " + salario * 1.10);
	}
}
