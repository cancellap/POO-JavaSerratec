package relacao;

import java.util.ArrayList;

public class TesteTime {

	public static void main(String[] args) {

		ArrayList<Atleta> Vasco = new ArrayList<Atleta>();

		Atleta a1 = new Atleta("Pablo Vegetti", "35");
		Atleta a2 = new Atleta("Payet", "36");
		Atleta a3 = new Atleta("Leo Pelé", "15");

		Vasco.add(a1);
		Vasco.add(a2);
		Vasco.add(a3);
		
		for (Atleta atleta : Vasco) {
			System.out.println(atleta);
		}
	}
}
