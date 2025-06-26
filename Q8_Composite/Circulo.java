package Q8_Composite;
public class Circulo implements Forma {
    private String nome;

    public Circulo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "Círculo: " + nome);
    }
}
