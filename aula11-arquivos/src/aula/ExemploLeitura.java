package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {

		File fl = new File("/curso/aula.txt");

		try {
			Scanner sc = new Scanner(fl, StandardCharsets.ISO_8859_1);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("Aqruivo nao encontrado");
		} catch (IOException e) {
			System.err.println("Codificacao invalida!");
		}
	}
}
