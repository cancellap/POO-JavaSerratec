package POO;

public class Cliente {
	//Atributos do cliente
	//Sempre é valido usar os atributos como classe
	//pois me da possibilidade de usar os metodos
	//da classe (String, por exemplo[01])
	String cpf, telefone, nome;
	Integer idade;
	Double peso;
	boolean status;//true or false
	
	
	public void mudaNome(String novoNome) {
        this.nome = novoNome; 
    }
}
