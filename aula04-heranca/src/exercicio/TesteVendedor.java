package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<VendedorFixo> Vendedores = new ArrayList<VendedorFixo>();

		String resp;
		Integer contador = 0;
		
		do {
			VendedorFixo vendedor = new VendedorFixo();
			
			System.out.println("Digite o nome: ");
			vendedor.setNome(sc.next());
			
			System.out.println("Digite o CPF: ");
			vendedor.setCpf(sc.next());

			System.out.println("Digite o salário base: ");
			vendedor.setSalarioBase(Double.parseDouble(sc.next()));

			System.out.println("Digite o valor da venda: ");
			vendedor.setValorDaVenda(Double.parseDouble(sc.next()));

			System.out.println(vendedor.calcularSalario());

			// add
			Vendedores.add(vendedor);

			System.out.println("Deseja continuar? s/n");
			resp = sc.next();
			contador++;
		} while ("s".equals(resp));

		
		for (VendedorFixo v : Vendedores) {
            System.out.println(v.getNome());
            System.out.println("----------------");
        }
		
	}

}
