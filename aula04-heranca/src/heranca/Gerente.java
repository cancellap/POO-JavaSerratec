package heranca;

public class Gerente extends Empregado {
	private String categoria;
	private Integer NumeroEmpregados;

	
	public Gerente(String nome, String cpf, Double salario, String categoria, Integer numeroEmpregados) {
		super(nome, cpf, salario);
		this.categoria = categoria;
		this.NumeroEmpregados = numeroEmpregados;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCategoria = " + categoria + "\nNumeroEmpregados = " + NumeroEmpregados;
		// super puxando o "toString" da class pai (Epregado);
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getNumeroEmpregados() {
		return NumeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		NumeroEmpregados = numeroEmpregados;
	}

}
