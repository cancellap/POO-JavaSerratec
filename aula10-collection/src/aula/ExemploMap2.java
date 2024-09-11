package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap2 {
	public static void main(String[] args) {
		HashMap<Integer, String> candidatos = new HashMap<>();
		
		candidatos.put(3, "Adriana");
		candidatos.put(1, "Ana");
		candidatos.put(5, "igor");
		candidatos.put(2, "Carlos");
		candidatos.put(4, "Carlos");
		
		for (Map.Entry<Integer, String> s : candidatos.entrySet()) {
			System.out.println(s);
		}
	}
}
