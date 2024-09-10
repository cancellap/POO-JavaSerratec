package exception;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 200.);
		try {
			cc.desposito(10.);
			cc.saque(10.);
		} catch (ContaException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println(cc.getSaldo());
		}
	}
}