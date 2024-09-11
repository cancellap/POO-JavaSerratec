package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(10, 40, 50, 60);
		List<String> listaString = Arrays.asList("Pedro", "joao", "anna");
		List<Object> listaObjetos = new ArrayList<>();
		imprimirListas(listaNumeros);
		imprimirListas(listaString);
		
		copiarListas(listaNumeros, listaObjetos);
		imprimirListas(listaObjetos);
		
	}

	public static void imprimirListas(List<?> lista) {
		for (Object o : lista) {
			System.out.println(o);
		}
	}
//                                  origem -> qualquer classe "filha" de Number     
//                                  destino-> qualquer coisa "superior" a Number	
	public static void copiarListas(List<? extends Number> origem, List<? super Number> destino) {
		for (Number numero : origem) {
			destino.add(numero);
		}
	}
}
