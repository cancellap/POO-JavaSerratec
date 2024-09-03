package exercicios;

import javax.swing.JOptionPane;

public class AntecessorSucessor {
	public static void main(String[] args) {
		int n = 0;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		System.out.println("Antecessor de " + n + ": " + (n+1));
		System.out.println("Sucessor de " + n + ": " + (n-1));
	}
}
