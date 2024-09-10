
public class Maiproduto {

	public static void main(String[] args) {

		Produto[] produtos = new Produto[2];
		produtos[0] = new Produto("celular", 1600.);
		produtos[1] = new Produto("tv", 2000.);

		for (Produto p : produtos) {
			System.out.println(p.toString());
		}
	}
}
