package exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;
	private Propietario propietario;

	public Carro(String modelo, LocalDate dateConserto, Propietario propietario,
			String categoria) {
		super(modelo, dateConserto, propietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = TipoServico.LAVEGEM.getValor();
	}

	@Override
	public double trocarOleo() {
		if (this.dateConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return valorCobrado = TipoServico.OLEO.getValor() - 50.;
		}
		return valorCobrado = TipoServico.OLEO.getValor();
	}

	@Override
	public double revisao() {
		if (this.dateConserto.getMonth() == Month.AUGUST) {
			return valorCobrado = TipoServico.REVISAO.getValor() - TipoServico.REVISAO.getValor() * 0.10;
		}
		return valorCobrado = TipoServico.REVISAO.getValor();
	}

}
