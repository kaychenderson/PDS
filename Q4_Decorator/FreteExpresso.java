// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public class FreteExpresso extends PedidoDecorator {
    public FreteExpresso(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", frete expresso";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 20.0;
    }
}
