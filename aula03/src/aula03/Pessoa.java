package aula03;

public class Pessoa {
	private Integer idade;
	private String nome;
	private Double peso;
	private Double altura;

	// Encapsulamento
	// Um metodo que fica "abstrato"

	private double calcImc() {
		return peso / (altura * altura);
	}

	public String resposta() {
		if (calcImc() < 18.5) {
			return "Abaixo do peso";
		} else if (calcImc() <= 24.9) {
			return "Peso normal";
		} else {
			return "Acima do peso";
		}
	}

	// Idade
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Peso
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	// Altura
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
