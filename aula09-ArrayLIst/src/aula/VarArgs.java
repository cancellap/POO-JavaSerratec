package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		 
		
		total = calcularSoma(100, 20, 30 ,10);
		System.out.println("Total: " + total);
		
		
	}

	//quem chamar essse metodos podera passar quandos paramentros quiser
	public static int calcularSoma(int num,int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		return soma * num;
	}

}
