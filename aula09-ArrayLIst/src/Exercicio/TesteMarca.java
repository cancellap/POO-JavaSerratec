package Exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteMarca {

	public static void main(String[] args) {
		List<Marca> marcas = new ArrayList();
		List<Marca> marcas2 = Arrays.asList(new Marca("3", "Chevrolet"), new Marca("4", "BMW"));

		marcas.add(new Marca("1", "Volks"));
		marcas.add(new Marca("2", "Fiat"));

		marcas.addAll(marcas2);

		for (Marca marca : marcas) {
			System.out.println(marca);
		}
	}
}
