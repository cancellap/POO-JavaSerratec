package aula03;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(126783, LocalDate.now(), 100.0);
		Pedido pedido2 = new Pedido(178673, LocalDate.now(), 240.0);
		Pedido pedido3 = new Pedido(178072, LocalDate.now(), 100.0);
		
		System.out.println(Pedido.getCont());

	}
}
