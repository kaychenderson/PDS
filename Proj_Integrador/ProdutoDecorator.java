
package Proj_Integrador;

public abstract class ProdutoDecorator extends Produto {
    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public abstract double getPreco();

    @Override
    public abstract String getDescricao();
}
