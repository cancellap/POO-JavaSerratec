package enumeradores;

//classe com final é imutavel - nao pode ter filho
public class Escola {
	private String cnpj;
	private String razaoSocial;

	public Escola(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	//o objeto pode usar, mas nao pode sobrescrito
	public final void gerarRelatorio() {
		System.out.println("Relatorio!");
	}
}
