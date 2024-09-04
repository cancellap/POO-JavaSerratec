package exercicio;

public abstract class Vendedor {
	protected String nome;
	protected String cpf;

	public Vendedor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Vendedor() {
	}

	@Override
	public String toString() {
		return "Nome : " + nome + " CPF: " + cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
