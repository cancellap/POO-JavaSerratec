package revisao;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {

	private boolean castrado;
	public Cachorro(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao, raca);
	}

	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
