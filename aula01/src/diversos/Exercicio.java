package diversos;

import javax.swing.JOptionPane;

public class Exercicio {
	public static void main(String[] args) {
		double altura;
		int idade;

		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura: "));
		/*
		 * if (altura >= 1.60 || idade >= 18) { System.out.println("Pode participar"); }
		 * else { System.out.println("Não pode participar"); }
		 */

		// Operação Ternaria
		String status = (altura >= 1.60 || idade >= 18 ? "Pode participar" : "Não pode participar");
		System.out.println(status);
		
		int mes =5;
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;	
			//etc
		default:
			System.out.println("Mês invalido");
			break;
		}
			String dia = "Domingo";
			//abreviação
			String resultado = switch (dia) {
			case "Domingo" -> "fim de semana";
			case "segunda" -> "Da Util";
			default -> "Dia invalido";
			};
			System.out.println(resultado);
			
		}
}
