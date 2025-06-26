
package Proj_Integrador;

public class ECommerceApp {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoBase("Notebook", 2500.00);
        produto1 = new ProdutoComFrete(produto1, 50.00);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item(produto1, 1));
        pedido.adicionarObserver(new EmailNotificacao());

        ProcessoCompraTemplate processo = new CompraOnline();
        processo.finalizarCompra(pedido);
    }
}
