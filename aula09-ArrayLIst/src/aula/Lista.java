package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Pedro");
		nomes.add("Maria");
		nomes.add("Fernando");
		nomes.add("Cleber");
		nomes.remove(2);

		// ele ja possui o "to string"
		// System.out.println(nomes);
		
	
		if (nomes.contains("Cleber")) {
			nomes.remove(nomes.indexOf("Cleber"));
		}


		for (String str : nomes) {

			System.out.println(str);

		}

	}
}
