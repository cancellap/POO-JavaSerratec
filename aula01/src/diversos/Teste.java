package diversos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		final int valor = 0;
		//final = const
		String primeiroNome;
		System.out.println("Hello World");
		//JOptionPane.showMessageDialog(null, "Hello");
		primeiroNome = JOptionPane.showInputDialog("Digite seu nome: ");
		System.out.println("Hello " + primeiroNome);
	}
}
