package br.com.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExemploTrabalho {

	public static void main(String[] args) {
		// "C:\curso\Empregado.csv"
		List<Empregado> empregados = new ArrayList<>();
		try {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = ler.next();
			Scanner sc = new Scanner(new File(nomeArquivo));

			while (sc.hasNext()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					// split retorna dentro de um vetor
					String[] dadosDaLinha = linha.split(";");
					String nome = dadosDaLinha[0];
					String profissao = dadosDaLinha[1];
					empregados.add(new Empregado(nome, profissao));
				}

			}
			sc.close();

		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
/*
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/curso/empregadoBw.txt"));
			for (Empregado empregado : empregados) {
				bw.append(empregado.getNome() + "  " + empregado.getProfissao() + "\n");
			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
 */
		System.out.println(empregados);
	}
}
