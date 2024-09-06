package revisao;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao) {
		super(nome, dataVacinacao);
		// TODO Auto-generated constructor stub
	}

	public abstract String voar();
}
