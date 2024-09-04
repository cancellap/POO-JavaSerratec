package relacao;

public class Atleta {
	private String nomeAleta;
	private String idade;

	public Atleta(String nomeAleta, String idade) {
		this.nomeAleta = nomeAleta;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return " NomeAtleta: " + nomeAleta + " Idade: " + idade;
	}

	public String getNomeAleta() {
		return nomeAleta;
	}

	public void setNomeAleta(String nomeAleta) {
		this.nomeAleta = nomeAleta;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}
