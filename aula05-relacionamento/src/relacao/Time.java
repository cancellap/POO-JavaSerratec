package relacao;

public class Time {
	private String nomeTime;
	private Atleta[] atletas;

	public Time(String nomeTime, Atleta[] atletas) {
		this.nomeTime = nomeTime;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return " Time: " + nomeTime;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public void adicionarAtleta(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}

	public void mostrarTime() {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] != null) {
				System.out.println(atletas[i].getNomeAleta());
			}else {
				return;
			}
		}

	}
}
