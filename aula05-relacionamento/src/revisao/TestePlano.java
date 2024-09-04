package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil", "Checkup", "123456");
		Medico m = new Medico("Unimed", "José", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "Geral");
		ControlePgto cp= new ControlePgto();
		
		c.calcularPagamento();
		cp.calcularTotal(c);
		m.calcularPagamento();
		cp.calcularTotal(m);
		a.calcularPagamento();
		cp.calcularTotal(a);
		
		System.out.println("---Clinica-----");
		System.out.println(c);
		System.out.println("---Medico------");
		System.out.println(m);
		System.out.println("---Anestesista-");
		System.out.println(a);
		System.out.println("---Total-------");
		System.out.println(cp.getTotalPago());
		
	} 

}
