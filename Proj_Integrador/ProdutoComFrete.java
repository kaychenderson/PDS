
package Proj_Integrador;

public class ProdutoComFrete extends ProdutoDecorator {
    private double valorFrete;

    public ProdutoComFrete(Produto produto, double valorFrete) {
        super(produto);
        this.valorFrete = valorFrete;
    }

    @Override
    public double getPreco() {
        return produto.getPreco() + valorFrete;
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + " (inclui frete)";
    }
}
