package testes;

import banco.Conta;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = "Pedro";
		conta1.numero = 12345;
		conta1.saldo = 100.00;
		
		conta1.depositar(50.00);
		
		if(conta1.saque(20.00)){
			System.out.println("Saque valido");
		}else {
			System.out.println("Sanque invalido");
		}
		
		
		System.out.println(conta1.saldo);
	}
}
