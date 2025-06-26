// Cenário: Um sistema de interface gráfica deve suportar múltiplos temas (Dark, Light, High Contrast), com estilos coesos 
// entre botões, caixas de texto e menus.

// Questão 3-B) Implemente uma forma de alternar dinamicamente o tema em tempo de execução.

public class MenuLight implements Menu {
    public void renderizar() {
        System.out.println("Menu estilo Light");
    }
}
