
package Proj_Integrador;

public class ProdutoBase extends Produto {
    private String descricao;
    private double preco;

    public ProdutoBase(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
