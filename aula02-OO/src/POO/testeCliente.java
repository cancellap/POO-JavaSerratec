package POO;

public class testeCliente {
	
	public static void main(String[] args) {
		// "puxo" a class cliente para criar
		// o meu cliente
		Cliente c1 = new Cliente();
		c1.nome = "Pedro";
		c1.cpf = "1234";
		c1.telefone = "1324535";
		c1.idade = 20;
		c1.mudaNome("Anna");
		c1.status = true;
		Cliente c2 = new Cliente();
		c2.nome = "Ana";
		System.out.println(c1.nome.toUpperCase());

	}
	
}
