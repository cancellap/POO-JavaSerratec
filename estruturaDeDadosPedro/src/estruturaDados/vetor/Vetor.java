package estruturaDados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	// construtor para fazer um vetor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) { for (int i = 0; i <
	 * this.elementos.length; i++) { if (this.elementos[i] == null) {
	 * this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception {
	 * 
	 * if (this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
	 * elemento; this.tamanho++; }else { throw new Exception("Vetor ja esta cheio");
	 * }
	 * 
	 * }
	 */

	public Boolean adiciona(String elemento) {
//tamanho - eu icrementa a cada execucao do metodo,
//assim criando uma maneira de saber o tamnho real o vetor
//tamanho real -> o index que nao esta null.
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
}
