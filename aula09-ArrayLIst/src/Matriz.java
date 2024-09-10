
public class Matriz {

	public static void main(String[] args) {
		String[][] pessoas = { { "jose", "jose@gmail.com" }, { "ana", "a@gmail.com" } };

		for (int i = 0; i < pessoas.length; i++) {

			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.print(pessoas[i] [j]);

			}
			System.out.println("\n");
		}
	}
}
