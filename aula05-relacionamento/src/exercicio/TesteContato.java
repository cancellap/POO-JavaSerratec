package exercicio;

import java.util.Arrays;
import java.util.List;

public class TesteContato {
	public static void main(String[] args) {
		Estado estado1 =new Estado("Rio", "RJ");
		Cidade cidade1 =new Cidade("Petropolis", estado1);
		Endereco endereco1 = new Endereco("Sao sebastiao", "Cristovao colombo", "25645045", cidade1);
		List<Telefone> telefones = Arrays.asList(new Telefone("98829723"),new Telefone("98826322"));
		
		Contado contato1 = new Contado("Eu");
		contato1.setEndereco(endereco1);
		contato1.addTelefone(telefones);
		
		System.out.println(contato1);
	}
}
