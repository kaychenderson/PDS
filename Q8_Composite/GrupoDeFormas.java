package Q8_Composite;
import java.util.ArrayList;
import java.util.List;

public class GrupoDeFormas implements Forma {
    private String nome;
    private List<Forma> formas = new ArrayList<>();

    public GrupoDeFormas(String nome) {
        this.nome = nome;
    }

    public void adicionar(Forma forma) {
        formas.add(forma);
    }

    public void remover(Forma forma) {
        formas.remove(forma);
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "Grupo: " + nome);
        for (Forma forma : formas) {
            forma.exibir(prefixo + "  ");
        }
    }
}
