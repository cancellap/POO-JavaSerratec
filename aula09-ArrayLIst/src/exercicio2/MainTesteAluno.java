package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import aula.ArraysLista;

public class MainTesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		String[][] dadosAlunos = { { "Pedro", "5.0", "6.9" }, { "Anna", "-5.0", "9.0" } };

		for (String[] dados : dadosAlunos) {
			try {
				Double nota1 = Double.parseDouble(dados[1]);
				Double nota2 = Double.parseDouble(dados[2]);
				Aluno aluno = new Aluno(dados[0], nota1, nota2);
				alunos.add(aluno);
			} catch (AlunoException e) {
				System.out.println(dados[0] + ": " + e.getMessage());
			}
		}
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome() + " -> " + aluno.calcularMedia());
		}

	}
}
