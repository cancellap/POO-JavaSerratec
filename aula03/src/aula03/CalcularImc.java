package aula03;

import javax.swing.JOptionPane;

public class CalcularImc {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Pedro");
		p.setIdade(20);
		p.setAltura(1.69);
		p.setPeso(68.8);
		
		
		System.out.println(p.resposta());
	}
}
