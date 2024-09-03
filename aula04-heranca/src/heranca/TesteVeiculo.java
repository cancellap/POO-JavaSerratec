package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {

		Moto v1 = new Moto("LVC3491", "Vermelinha", 20000.0, true);
		Caminhao v2 = new Caminhao("ABS1232", "Pretinho", 1100000., 1000);

		System.out.println(v1.toString());
		System.out.println("IPVA: " + v1.calcularIPva());
		System.out.println(v2.toString());
		System.out.println("IPVA: " + v2.calcularIPva());
	}

}
