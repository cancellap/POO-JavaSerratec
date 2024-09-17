package aula;

public class TesteEquals {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("45643", "ABC ltda");
		Fornecedor f2 = new Fornecedor("69783", "ABC ltda");

		String resultado = (f1.equals(f2) ? "iguais" : "Diferentes");

		System.out.println(resultado);
	}

}
