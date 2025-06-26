
package Proj_Integrador;

public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return produto.getPreco() * quantidade;
    }
}
