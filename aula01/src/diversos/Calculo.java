package diversos;

import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		calcular(n1,n2);
	}
	
	public static void calcular(double n1, double n2) {
		JOptionPane.showMessageDialog(null, "A media dos numeros: " + (n1 + n2)/2);
	}
}
