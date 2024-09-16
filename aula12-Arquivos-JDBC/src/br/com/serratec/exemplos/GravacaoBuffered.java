package br.com.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class GravacaoBuffered {

	public static void main(String[] args) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/curso/aula.txt"));
			for (int i = 0; i < 10; i++) {
				bw.write("Vasco\n");

			}
			System.out.println("Arquivo editado");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
