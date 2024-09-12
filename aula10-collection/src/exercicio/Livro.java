package exercicio;

public class Livro {
	private String titulo;
	private String autor;
	private Double preco;

	public Livro(String titulo, String autor, Double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "titulo: " + titulo + "\nautor: " + autor + "\npreco: " + preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Double getPreco() {
		return preco;
	}

}
