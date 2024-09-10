package exercicio;

public class Produto {
	private int codigo;
	private String descricao;
	private Double valor;
	private Categoria catego;

	public Produto(int codigo, String descricao, Double valor, Categoria catego) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.catego = catego;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Categoria getCatego() {
		return catego;
	}

	public void setCatego(Categoria catego) {
		this.catego = catego;
	}

}
