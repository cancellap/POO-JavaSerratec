package exercicio2;

public class Aluno {
	private String nome;
	private Double nota1;
	private Double nota2;

	public Aluno(String nome, Double nota1, Double nota2) {
		if (nota1 < 0 || nota2 < 0) {
			throw new AlunoException("Nota invalida, nao pode ser negativa! ");
		} else {
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
		}
	}

	public String getNome() {
		return nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public Double calcularMedia() {
		Double media = (nota1 + nota2) / 2;
		return media;

	}
}
