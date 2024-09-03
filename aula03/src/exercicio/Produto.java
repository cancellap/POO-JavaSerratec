package exercicio;

public class Produto {

	private String nome;
	private Double valor;
	private Integer quantidade;
	static private Double total;

	public Produto(Integer quantidade, Double valor, String nome) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.nome = nome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nValor: " + valor + "\nQuantidade: " + quantidade + "\nICMS: " +this.calcIcms();
	}

	private Double total() {
		Double total = valor * quantidade;
		return total;
	}

	public Double calcIcms() {
		Double totalIcms = total() * 0.12;
		return totalIcms;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return total();
	}

}
