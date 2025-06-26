
package Proj_Integrador;

public class EmailNotificacao implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Enviando email: Pedido " + pedido.getStatus());
    }
}
