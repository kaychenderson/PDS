public class TransferenciaService {
    public boolean transferir(String origem, String destino, double valor) {
        System.out.printf("Transferindo R$%.2f de %s para %s%n", valor, origem, destino);
        return true;
    }
}
