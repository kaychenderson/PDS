public class AutenticacaoService {
    public boolean autenticar(String usuario, String senha) {
        return usuario.equals("cliente") && senha.equals("1234");
    }
}
