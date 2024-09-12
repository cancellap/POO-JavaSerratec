package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraDelimitador {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("src/teste/alunos.csv"));
			sc.useDelimiter(";");
			// hasNext -> retorna um boolean
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo nao encontrado");
		}
	}
}
