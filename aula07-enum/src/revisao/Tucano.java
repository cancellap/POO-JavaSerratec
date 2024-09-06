package revisao;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, double peso) {
		super(nome, dataVacinacao);
		this.peso = peso;
	}

	@Override
	public String voar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
