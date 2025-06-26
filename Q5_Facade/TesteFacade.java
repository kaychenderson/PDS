public class TesteFacade {
    public static void main(String[] args) {
        BancoFacade banco = new BancoFacade();
        banco.realizarTransferencia("cliente", "1234", "001", "002", 500.0);
    }
}
