
package Proj_Integrador;

public class CompraOnline extends ProcessoCompraTemplate {
    private PagamentoFacade pagamentoFacade = new PagamentoFacade();

    @Override
    protected boolean validarCarrinho(Pedido pedido) {
        return !pedido.getItens().isEmpty();
    }

    @Override
    protected void processarPagamento(Pedido pedido) {
        pagamentoFacade.processarPagamento(pedido.calcularTotal(), "CREDITO");
    }

    @Override
    protected void atualizarEstoque(Pedido pedido) {
        System.out.println("Atualizando estoque dos itens comprados");
    }
}
