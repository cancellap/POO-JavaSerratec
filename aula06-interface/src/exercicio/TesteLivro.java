package exercicio;

public class TesteLivro {
	public static void main(String[] args) {
		Livro livro = new Livro("Machado Assis", "Dom casmuro", 30.);
		Operacao op1 = new Operacao("Venda", livro);
		
		System.out.println(op1.venderLivro());
	}
}
