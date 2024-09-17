package aula;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TesteFornecedor {

	public static void main(String[] args) {

		List<Fornecedor> fornecedores = new ArrayList<>();
		Fornecedor f1 = new Fornecedor("2343", "ABC ltda");
		Fornecedor f2 = new Fornecedor("6753", "XPTO ltda");
		Fornecedor f3 = new Fornecedor("6753", "XPTO ltda");
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		try {
			FileOutputStream arqGravar = new FileOutputStream("/curso/fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arqGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arqGravar.flush();
			arqGravar.close();
			System.out.println("foi");
		} catch (Exception e) {
			System.err.println("erro");
			e.printStackTrace();
		}
		
	}

}
