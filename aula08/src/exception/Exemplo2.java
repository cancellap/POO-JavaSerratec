package exception;

public class Exemplo2 {
	public static void main(String[] args) {
		int vetor[] = { 20, 30, 45 };
		int i = 10, j = 0, resultado;
		String texto = null;
		
		try {
			System.out.println(vetor[4]);
			resultado = i/j;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro indice fora do tamanho");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Divisao por 0");
		}catch (NullPointerException e) {
			System.err.println("Valores nulos");
		}
	}
}
