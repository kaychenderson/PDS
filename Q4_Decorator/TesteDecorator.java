// Cenário: Um sistema de pedidos precisa adicionar dinamicamente funcionalidades como embalagem para presente, frete expresso 
// e seguro.

// Questão 4-A) Modele uma fachada que simplifique o uso dessa API para desenvolvedores frontend.

public class TesteDecorator {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBase(); //500.00
        pedido = new EmbalagemPresente(pedido); //10.00
        pedido = new FreteExpresso(pedido); //20.00
        pedido = new Seguro(pedido); //5%

        System.out.println(pedido.getDescricao());
        System.out.printf("Custo total: R$ %.2f%n", pedido.getCusto());
    }
}
