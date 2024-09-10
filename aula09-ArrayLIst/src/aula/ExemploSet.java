package aula;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class ExemploSet {

	public static void main(String[] args) {

		//treeSet ->ArvoreBinaria ja vem ordenada, porem perde em performace
		Set<String> listaArvore=  new TreeSet<>();
		listaArvore.add("Flamengo");
		listaArvore.add("vasco");
		listaArvore.add("Botafogo");
		listaArvore.add("vasco");
		System.out.println(listaArvore);
		
		//Set -> uma interface;
		//HashSet -> nao aceita elementos duplicados
		Set<String> lista=  new HashSet<>();
		lista.add("Flamengo");
		lista.add("vasco");
		lista.add("Botafogo");
		lista.add("vasco");
		
		System.out.println(lista);
	}

}
