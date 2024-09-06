package exercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;
		
	public Moto(String modelo, LocalDate dateConserto, Propietario propietario, int cilindradas) {
		super(modelo, dateConserto, propietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
