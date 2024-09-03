package exercicios;

import javax.swing.JOptionPane;

public class Medidas {

	public static void main(String[] args) {
		String[] nome = new String[3];
		Double[] altura = new Double[3];
		Double[] peso = new Double[3];

		for (int i = 0; i < 3; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite seu nome: ");

			for (int j = 0; j < 1; j++) {
				altura[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
			}

			for (int x = 0; x < 1; x++) {
				peso[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
			}
		}

		int somaPeso = 0;
		for (int i = 0; i <= 3; i++) {
			somaPeso += peso[i];
		}
		int mediaPeso = somaPeso / 3;

		int somaAltura = 0;
		for (int i = 0; i <= 3; i++) {
			somaAltura += altura[i];
		}
		int mediaAltura = somaPeso / 3;

	}

}
