package aula;

public class TesteEquals {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("45643", "ABC ltda");
		Fornecedor f2 = new Fornecedor("89785", "ABC ltda");

		String resultado = (f1.equals(f2) ? "iguais" : "Diferentes");

		System.out.println(resultado);
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
	}

}
