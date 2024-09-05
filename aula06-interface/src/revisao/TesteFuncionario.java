package revisao;

public class TesteFuncionario {
	public static void main(String[] args) {
		Assistente a = new Assistente("Paulinho", 1000., "Manhazinha", "-1");
		Diretor d =new Diretor("deco", 100000., "Tardezinha", "Adm");
		
		a.reajusteSalrial();
		d.reajusteSalrial();
		
		System.out.println(a);
		System.out.println(d);
		
	}
}
