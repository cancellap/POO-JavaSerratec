package enumeradores;

public class TesteTurma {

	public static void main(String[] args) {
		Turma t = new Turma(1234, PeriodoCurso.INTEGRAL);
		
		System.out.println("Curso: " + t.getNumero());
		System.out.println("Dias: "+ t.getPeriodoCurso().getDias());
		System.out.println("Carga hor.: "+ t.getPeriodoCurso().getCargaHoraria()+"h");
		System.out.println("Valor: " + t.getPeriodoCurso().getValor());
		
	}

}
