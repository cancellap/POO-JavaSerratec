package heranca;

public class Moto extends Veiculo {
	private Boolean capacete;

	public Moto(String placa, String cor, Double preco, Boolean capacete) {
		super(placa, cor, preco);
		this.capacete = capacete;
	}

	@Override
	public String toString() {
		return super.toString() + " | Capatece: " + capacete;
	}

	public Boolean getCapacete() {
		return capacete;
	}

	public void setCapacete(Boolean capacete) {
		this.capacete = capacete;
	}

	@Override
	public Double calcularIPva() {
		//Calculo meramente ilustrativo
		return preco * 0.04 + 100;
	}

}
