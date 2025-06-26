package Q7_Adapter;
public class AdapterPorComposicao implements BibliotecaModerna {
    private BibliotecaAntigaB bibliotecaAntiga;

    public AdapterPorComposicao(BibliotecaAntigaB bibliotecaAntiga) {
        this.bibliotecaAntiga = bibliotecaAntiga;
    }

    @Override
    public String buscarLivro(String titulo) {
        return bibliotecaAntiga.findBook(titulo);
    }
}
