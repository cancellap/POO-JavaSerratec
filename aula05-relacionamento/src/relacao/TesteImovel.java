package relacao;

public class TesteImovel {
	
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("pedro", "pedro@...");
		Pessoa p2 = new Pessoa("Anna", "anna@...");

		Imovel i1 = new Imovel("apto", 1000000., p1);
		Imovel i2 = new Imovel("apto", 1000000., p2);
		
		System.out.println(i1);
	}
}
