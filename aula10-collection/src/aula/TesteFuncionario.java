package aula;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteFuncionario {
	public static void main(String[] args) {

		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Ana", 38), new Funcionario("Pedro", 21),
				new Funcionario("Alex", 60));

		for (Funcionario f : funcionarios) {
			System.out.println(f);
			System.out.println(" ");
		}

		Collections.sort(funcionarios);
		
		System.out.println("-------------------------");
		
		
		for (Funcionario f : funcionarios) {
			System.out.println(f);
			System.out.println(" ");
		}

	}
}
