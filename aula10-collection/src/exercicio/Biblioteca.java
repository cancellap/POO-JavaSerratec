package exercicio;

import java.util.List;
public class Biblioteca {
	private String responsavel;
	private List<Livro> livros;


	
	public Biblioteca(String responsavel, List<Livro> livros) {
		this.responsavel = responsavel;
		this.livros = livros;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void addLivro(List<Livro> livros, Livro novoLivro){
		livros.add(novoLivro);
	}
	
	public void listarLivro() {
		for (Livro l : livros) {
			System.out.println(l);
			System.out.println("--------");
		}
	}
}
