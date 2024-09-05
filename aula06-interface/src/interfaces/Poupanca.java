package interfaces;

public class Poupanca implements Conta {
	private String titular;
	private Double saldo;

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "titular: " + titular + ", saldo: " + saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void saque(Double valor) {
		//sem exeption
		if (saldo<valor) {
			System.out.println("Saldo Insuficente");
		}else {
			System.out.println("Saque esfetuado");
		}
	}

	@Override
	public void deposito(Double valor) {
		//sem exeption
		if (valor<0) {
			System.out.println("Valor invalido");
		}else {
			System.out.println("Deposito efetuado");
		}

	}

}
