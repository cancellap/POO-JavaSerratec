package exercicio;

public enum TipoServico {
OLEO(100.), LAVEGEM(50.), REVISAO(200.);
	private Double valor;

	

	private TipoServico(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}
}
