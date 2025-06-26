// Cenário: Um sistema de interface gráfica deve suportar múltiplos temas (Dark, Light, High Contrast), com estilos coesos 
// entre botões, caixas de texto e menus.

// Questão 3-B) Implemente uma forma de alternar dinamicamente o tema em tempo de execução.

public class InterfaceGrafica {
    private Botao botao;
    private CaixaTexto caixaTexto;
    private Menu menu;

    public InterfaceGrafica(TemaFactory factory) {
        this.botao = factory.criarBotao();
        this.caixaTexto = factory.criarCaixaTexto();
        this.menu = factory.criarMenu();
    }

    public void renderizar() {
        botao.renderizar();
        caixaTexto.renderizar();
        menu.renderizar();
    }
}
