package revisao;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao, raca);
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

	@Override
	public void trocarFerradura() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub

	}

}
