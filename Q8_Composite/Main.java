package Q8_Composite;

public class Main {
    public static void main(String[] args) {
        Forma sol = new Circulo("Sol");
        Forma parede = new Quadrado("Parede");
        Forma janela = new Quadrado("Janela");

        GrupoDeFormas casa = new GrupoDeFormas("Casa");
        casa.adicionar(parede);
        casa.adicionar(janela);

        GrupoDeFormas desenho = new GrupoDeFormas("DesenhoPrincipal");
        desenho.adicionar(sol);
        desenho.adicionar(casa);

        desenho.exibir("");
    }
}
