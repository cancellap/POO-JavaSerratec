package enumeradores;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Paulinho", EstadoCivil.CASADO);
	
		System.out.println(p.getNome() + " - " + p.getEstadoCivil());
		
		//foreach -> itera sobre array
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println("---------------");
			System.out.println(ec);
		}

	}

}
