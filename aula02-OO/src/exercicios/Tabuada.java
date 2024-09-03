package exercicios;

import javax.swing.JOptionPane;

public class Tabuada {
	// n * i
	public static void main(String[] args) {
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(" | "+i + " x " + n + " = " + n * i);
		}

	}
}
