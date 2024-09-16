package br.com.serratec.exemplos;

public class Empregado {

	private String nome;
	private String profissao;

	public Empregado(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nprofissao: \n" + profissao + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
