// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedidoDecorado;

    public PedidoDecorator(Pedido pedido) {
        this.pedidoDecorado = pedido;
    }

    @Override
    public String getDescricao() {
        return pedidoDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return pedidoDecorado.getCusto();
    }
}
