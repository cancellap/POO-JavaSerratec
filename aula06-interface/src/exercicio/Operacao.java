package exercicio;

public class Operacao implements InterfaceLivraria{
	private String tipo;
	private Double valorOperacao;
	private Livro livro;

	public Operacao(String tipo,Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public Double venderLivro() {
		return valorOperacao = livro.getValor() * 1.9;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor()*0.2 + TAXAEMPRESTIMO;
	}

}
