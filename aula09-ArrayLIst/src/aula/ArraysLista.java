package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysLista {

	public static void main(String[] args) {
		List<String> bichos = Arrays.asList("Cão","Gato", "Coelho", "Ganso");

		bichos.set(2, "Papagaio");
		for (String string : bichos) {
			System.out.println(string);
		}
		//Collections -> uma class -> sort: metodo que espera umas lista <t>
		Collections.sort(bichos);
	}
}
