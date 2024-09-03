package heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("João Silva", "123.456.789-00", 7500.0, "Sênior", 20);
		g1.aumentarSalario();
		System.out.println(g1.toString());
	}

}
