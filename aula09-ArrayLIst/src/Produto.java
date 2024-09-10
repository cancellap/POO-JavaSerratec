
public class Produto {
	private String descricao;
	private Double valor;

	public Produto(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	
	@Override
	public String toString() {
		return "Produto: " + descricao + "| valor: " + valor;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
