package Q7_Adapter;
public class AdapterPorHeranca extends BibliotecaAntigaA implements BibliotecaModerna {
    @Override
    public String buscarLivro(String titulo) {
        return localizar(titulo);
    }
}
