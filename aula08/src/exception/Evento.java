package exception;

import javax.swing.JOptionPane;

public class Evento {
	private String email;
	private int idade;

	public Evento(String email, int idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("Menor de idade!");
		} else {
			this.email = email;
			this.idade = idade;
			JOptionPane.showMessageDialog(null, "Cadastrado!");
		}
	}

	public static void main(String[] args) {
		int opcao = 0;
		do {
			try {
				String email = JOptionPane.showInputDialog("Email: ");
				Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
				Evento evento = new Evento(email, idade);
				opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar cadastrar mais um?", "Informacao", 0, 0);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				e.getStackTrace();
			}

		} while (opcao == 0);
	}
}
