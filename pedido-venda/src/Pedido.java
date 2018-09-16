/**
 * 
 * @author Luiz
 * 
 * Regras
 * 
 * Se passar de R$300,00 tem 4%
 * 
 * Se passar de R$800,00 tem 6%
 *
 */
public class Pedido {
	
	private double valorTotal;
	private double desconto;

	public void adicionarItem(ItemPedido itemPedido) {
		valorTotal = itemPedido.getValorUnitario() * itemPedido.getQuantidade();
	}

	public double valorTotal() {
		return valorTotal;
	}

	public double desconto() {
		return desconto;
	}

}
