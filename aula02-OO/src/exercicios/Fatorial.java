package exercicios;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite um numero para calcular o fatorial: ");
		int num = Integer.parseInt(leitura.nextLine());
		leitura.close();
		System.out.println(calcFat(num));
		
	}

	public static int calcFat(int num) {
		int fat = 1;
		for (int i = 2; i <= num; i++) {
			fat *= i;
		}
		return fat;
	}

}
