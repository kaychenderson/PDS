package Q7_Adapter;

public class SistemaGestaoEscolar {
    public void consultarLivro(BibliotecaModerna biblioteca, String titulo) {
        System.out.println(biblioteca.buscarLivro(titulo));
    }

    public static void main(String[] args) {
        SistemaGestaoEscolar sistema = new SistemaGestaoEscolar();

        BibliotecaModerna adaptadorA = new AdapterPorHeranca();
        sistema.consultarLivro(adaptadorA, "Dom Casmurro");

        BibliotecaAntigaB bibliotecaAntigaB = new BibliotecaAntigaB();
        BibliotecaModerna adaptadorB = new AdapterPorComposicao(bibliotecaAntigaB);
        sistema.consultarLivro(adaptadorB, "Memórias Póstumas");
    }
}
