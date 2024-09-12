package exercicio;

import java.util.ArrayList;

public class MainBiblioteca {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 59.90));
		livros.add(new Livro("Dom Casmurro", "Machado de Assis", 29.90));
		livros.add(new Livro("O Hobbit", "J.R.R. Tolkien", 49.90));

		Biblioteca bi = new Biblioteca("pedro", livros);
		bi.listarLivro();

		bi.addLivro(livros, new Livro("Crime e Castigo", "Fiódor Dostoiévski", 54.90));
		System.out.println("------add mais um livro------");
		bi.listarLivro();

	}
}
