package relacao;

public class Imovel {
	private String tipo;
	private Double valor;
	// relacionamento - uma pessoa possui um imovel
	// relacionamento <> herança
	private Pessoa pessoa;

	public Imovel(String tipo, Double valor, Pessoa pessoa) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + " Valor: " + valor + pessoa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
