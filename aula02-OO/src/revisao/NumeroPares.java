package revisao;

public class NumeroPares {

	public static void main(String[] args) {
		int pares = 0, impares = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " par");
				pares++;
			} else {
				System.out.println(i + " impar");
				impares++;
			}
		}
		System.out.println("pares " + pares + " | impares " + impares);
	}
}
