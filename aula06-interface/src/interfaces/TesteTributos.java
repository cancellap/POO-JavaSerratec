package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		
		TotalTributos t = new TotalTributos();
		Empresa e = new Empresa("abc ltda", 288500.);
		Pessoa p = new Pessoa("Mariazinha", 98000.);
		
		t.totalizarTributos(p);
		t.totalizarTributos(e);
		
		System.out.println(p.getNome() +"- "+p.calcularIR());
		System.out.println(p.getNome() +" - "+p.calcularICMS());
		
		System.out.println(e.getRazaoSocial() +" - "+e.calcularIR());
		System.out.println(e.getRazaoSocial() +" - "+e.calcularICMS());

		System.out.println("Total geral: "+ t.getTotalGeral());
	}
}
