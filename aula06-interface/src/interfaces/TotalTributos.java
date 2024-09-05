package interfaces;

public class TotalTributos {
	private Double totalGeral = 0.0;

	public void totalizarTributos(Tributos t) {
		totalGeral += t.calcularIR();
		totalGeral += t.calcularICMS();
	}

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}

}
