package relacao;


public class TesteTime {

	
	public static void main(String[] args) {
		
		 Atleta a1 = new Atleta("Pablo Vegetti", "35");
		 Atleta a2 = new Atleta("Payet", "36");
		 Atleta a3 = new Atleta("Leo Pelé", "15");
		 
		 Time tm1= new Time("Vasco", new Atleta[3]);
		 tm1.adicionarAtleta(a1);
		 tm1.adicionarAtleta(a2);
		 tm1.adicionarAtleta(a3);
		 tm1.mostrarTime();
	}
}
