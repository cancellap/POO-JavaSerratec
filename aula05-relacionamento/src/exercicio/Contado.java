package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Contado {
	private String nomeContado;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();

	public Contado(String nomeContado) {
		super();
		this.nomeContado = nomeContado;
	}

	@Override
	public String toString() {
		return "Contado [nomeContado=" + nomeContado + endereco + ", telefones=" + telefones + "]";
	}

	public String getNomeContado() {
		return nomeContado;
	}

	public void setNomeContado(String nomeContado) {
		this.nomeContado = nomeContado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void addTelefone(List<Telefone> telefone) {
		telefones.addAll(telefone);
	}
	public void listarTelefones() {
		for(Telefone v : telefones) {
			System.out.println(v.getNumero());
		}
	}

}
