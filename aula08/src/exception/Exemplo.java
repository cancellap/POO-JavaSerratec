package exception;

public class Exemplo {
	// throw -> lancar
	// throws -> encaminha o tratamento erro para o metodo chamador

	public static double calcular(int a, int b) throws ArithmeticException {
		/*
		 * if(b==0) { throw new ArithmeticException("Divisor nao pode ser 0"); }
		 */

		return a / b;
	}

	public static void main(String[] args) {

		try {
			System.out.println("Resultado: " + calcular(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("O divisor nao pode ser 0");
		} finally {
			System.out.println("Sempre é executado!");
		}
	}

}
