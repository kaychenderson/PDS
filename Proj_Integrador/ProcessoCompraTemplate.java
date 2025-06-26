
package Proj_Integrador;

public abstract class ProcessoCompraTemplate {
    public final void finalizarCompra(Pedido pedido) {
        if (validarCarrinho(pedido)) {
            processarPagamento(pedido);
            atualizarEstoque(pedido);
            pedido.setStatus("COMPLETO");
            pedido.notificarObservers();
        } else {
            pedido.setStatus("FALHA NA VALIDAÇÃO");
            pedido.notificarObservers();
        }
    }

    protected abstract boolean validarCarrinho(Pedido pedido);
    protected abstract void processarPagamento(Pedido pedido);
    protected abstract void atualizarEstoque(Pedido pedido);
}
