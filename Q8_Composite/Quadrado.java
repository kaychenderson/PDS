package Q8_Composite;
public class Quadrado implements Forma {
    private String nome;

    public Quadrado(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "Quadrado: " + nome);
    }
}
