// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public class PedidoBase implements Pedido {
    @Override
    public String getDescricao() {
        return "Pedido base";
    }

    @Override
    public double getCusto() {
        return 500.0;
    }
}
