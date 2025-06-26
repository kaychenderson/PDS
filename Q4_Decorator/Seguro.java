// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public class Seguro extends PedidoDecorator {
    private final double percentual = 0.05; // 5%

    public Seguro(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", seguro";
    }

    @Override
    public double getCusto() {
        return super.getCusto() * (1 + percentual);
    }
}
