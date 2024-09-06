package exercicio;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dateConserto;
	protected Propietario propietario;

	public Veiculo(String modelo, LocalDate dateConserto, Propietario propietario) {
		super();
		this.modelo = modelo;
		this.dateConserto = dateConserto;
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dateConserto=" + dateConserto
				+ ", propietario=" + propietario + "]";
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

}
