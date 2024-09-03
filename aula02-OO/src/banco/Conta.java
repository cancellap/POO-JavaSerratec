package banco;

public class Conta {
	public Integer numero;
	public String titular;
	public Double saldo;

	// void sem retorno
	public void depositar(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor Invalido");
		} else {
			saldo += valor;
		}
	}

	// retorna um boolean
	public boolean saque(Double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
	
	
	
}
