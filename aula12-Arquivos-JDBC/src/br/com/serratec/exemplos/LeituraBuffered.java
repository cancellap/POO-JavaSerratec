package br.com.serratec.exemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraBuffered {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/curso/aula.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}

		} catch (FileNotFoundException e) {
			System.err.println("Arquivo nao encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
