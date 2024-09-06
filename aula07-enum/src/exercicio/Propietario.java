package exercicio;

public class Propietario {
	private String nome;

	public Propietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "]";
	}

	public String getNome() {
		return nome;
	}

}
