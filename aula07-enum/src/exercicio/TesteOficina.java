package exercicio;

import java.time.LocalDate;

public class TesteOficina {
	
	public static void main(String[] args) {
		Propietario p1 = new Propietario("Pedro");
		Carro c1 = new Carro("Fusca", LocalDate.of(2024, 8, 10), p1, "SUV");
		c1.lavarVeiculo();
		c1.revisao();
		System.out.println(c1.getValorCobrado());
	}
}
