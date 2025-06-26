// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public class EmbalagemPresente extends PedidoDecorator {
    public EmbalagemPresente(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", embalagem-presente";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 10.0;
    }
}
