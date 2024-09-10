package exercicio;

import java.time.LocalDate;

public class Venda implements FinalizarVenda{
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	static Double totalVendas;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade + "]";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static Double getTotalVendas() {
		return totalVendas;
	}

	public static void setTotalVendas(Double totalVendas) {
		Venda.totalVendas = totalVendas;
	}

	@Override
	public void calcularVenda() {
		
	}
	
}
