package revisao;

public class exemplos {

	public static void main(String[] args) {
		/*
		 * int i = 1; while (i <= 10) { System.out.println(i); i++; }
		 */

		String[] times = { "Vasco", "Flamengo", "Botafogo", "Fluminense" };

		for (int j = 0; j < times.length; j++) {
			if (j >= 1 && j <= 2) {
				continue;
			}
			System.out.println(times[j]);
		}

		/*
		 * System.out.println("<foreach>");
		 * 
		 * for (String t : times) { System.out.println(t); }
		 */
	}

}
