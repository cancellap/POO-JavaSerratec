package interfaces;

//Uma interface nao pode ser instanciada
//nao pode ter implementacao
//atributos sao final(constante)
public interface Conta {
	Double IMPOSTO = 10.0;
	void saque(Double valor);
	void deposito(Double valor);	

}
