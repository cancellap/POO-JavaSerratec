package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		Integer contador = 0;
		String resp = "";

		do {
			
			System.out.println("Escolha o tipo de vendedor: ");
			System.out.println("1 - Vendedor Fixo");
			System.out.println("2 - Freelancer");
			int tipoVendedor = sc.nextInt();

			switch (tipoVendedor) {
			case 1:
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
				vendedores.add(vendedor);
				break;
			case 2:
				FreeLancer vendedorFixo = new FreeLancer();
				System.out.println("Digite o nome: ");
				vendedorFixo.setNome(sc.next());

				System.out.println("Digite o CPF: ");
				vendedorFixo.setCpf(sc.next());

				System.out.println("Dias trabalhados: ");
				vendedorFixo.setDiasTrabalhados(Integer.parseInt(sc.next()));

				System.out.println("Valor por dia: ");
				vendedorFixo.setValorDia(Double.parseDouble(sc.next()));

				System.out.println(vendedorFixo.calcFinal());
				vendedores.add(vendedorFixo);
				break;
			default:
				System.out.println("Opção inválida.");
				continue;
			}

			System.out.println("Deseja continuar? s/n");
			resp = sc.next();
			contador++;
		
		} while ("s".equalsIgnoreCase(resp));
		for (Vendedor v : vendedores) {
			System.out.println(v.getNome());
			System.out.println("----------------");
		}

		sc.close();
	}
}
