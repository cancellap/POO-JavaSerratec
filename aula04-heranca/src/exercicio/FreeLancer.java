package exercicio;

public class FreeLancer extends Vendedor {
	private Integer diasTrabalhados;
	private Double valorDia;
	private Double valorFinal;

	public FreeLancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		return super.toString() + " Dias trabalhados: " + diasTrabalhados + " Valor dia: " + valorDia;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

	public double calcFinal() {
		return valorFinal = diasTrabalhados * valorDia;
	}

}
