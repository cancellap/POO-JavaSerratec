package exercicio;

public class VendedorFixo extends Vendedor {
	private Double salarioBase;
	private Double comissao;
	private Double salarioBruto;
	private Double valorDaVenda;

	public VendedorFixo() {
	}
	
	public VendedorFixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto,
			Double valorDaVenda) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = 0.;
		this.salarioBruto = 0.;
		this.valorDaVenda = valorDaVenda;
	}
	

	@Override
	public String toString() {
		return super.toString() + " Salario Base: " + salarioBase + " Comissão " + comissao + " Salário Bruto "
				+ salarioBruto;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getValorDaVenda() {
		return valorDaVenda;
	}

	public void setValorDaVenda(Double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}

	public Double calcularVenda() {
		return valorDaVenda * 0.12;
	}

	public Double calcularSalario() {
		comissao = calcularVenda();
		return salarioBruto = salarioBase + comissao;
		
	}
}
