// Cenário: Um sistema de interface gráfica deve suportar múltiplos temas (Dark, Light, High Contrast), com estilos coesos 
// entre botões, caixas de texto e menus.

// Questão 3-B) Implemente uma forma de alternar dinamicamente o tema em tempo de execução.

import java.util.Scanner;

// public class Teste {
//     public static void main(String[] args) {
//         TemaFactory tema = new TemaDarkFactory(); // Pode mudar para TemaLightFactory()
//         InterfaceGrafica ui = new InterfaceGrafica(tema);
//         ui.renderizar();
//     }
// }

public class TesteAbstractMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tema. \nDigite: (dark ou light): ");
        String escolha = sc.nextLine();

        TemaFactory tema;

        if (escolha.equalsIgnoreCase("dark")) {
            tema = new TemaDarkFactory();
        } else {
            tema = new TemaLightFactory();
        }

        InterfaceGrafica ui = new InterfaceGrafica(tema);
        ui.renderizar();

        sc.close();
    }
}
