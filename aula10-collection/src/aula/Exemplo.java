package aula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		
		List<String> Lista = new ArrayList<>();
		
		//set nao permite elementos repidos
		//fica em ordem aleatoria
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(10);
		numeros.add(40);
		numeros.add(60);
		numeros.add(20);
		System.out.println(numeros);
		System.out.println("--------------------");
		// ordem de FIFO (chegada)
		Set<Integer> numeros1 = new LinkedHashSet<>();
		numeros1.add(10);
		numeros1.add(40);
		numeros1.add(60);
		numeros1.add(20);
		System.out.println(numeros1);
		System.out.println("--------------------");
		//treeSet -> em ordem
		Set<Integer> numeros2 = new TreeSet<Integer>();
		numeros2.add(10);
		numeros2.add(40);
		numeros2.add(60);
		numeros2.add(20);
		System.out.println(numeros2);
		
	}

}
