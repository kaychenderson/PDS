// Cenário: Uma API complexa de serviços bancários oferece operações de autenticação, verificação de saldo, cálculo de taxas 
// e execução de transferências.

// Questão 5-B) Como isolar a lógica da fachada para permitir testes unitários do backend?

public class BancoFacade {
    private AutenticacaoService auth;
    private ContaService conta;
    private TaxaService taxa;
    private TransferenciaService transf;

    // public BancoFacade() {
    //     this.auth = new AutenticacaoService();
    //     this.conta = new ContaService();
    //     this.taxa = new TaxaService();
    //     this.transf = new TransferenciaService();
    // }

    // Construtor com injeção de dependências - B)
    public BancoFacade(AutenticacaoService auth, ContaService conta, TaxaService taxa, TransferenciaService transf) {
        this.auth = auth;
        this.conta = conta;
        this.taxa = taxa;
        this.transf = transf;
    }

    public void realizarTransferencia(String usuario, String senha, String contaOrigem, String contaDestino, double valor) {
        if (!auth.autenticar(usuario, senha)) {
            System.out.println("Autenticação falhou.");
            return;
        }

        double saldo = conta.consultarSaldo(contaOrigem);
        double taxaValor = taxa.calcularTaxa(valor);
        double total = valor + taxaValor;

        if (saldo < total) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        transf.transferir(contaOrigem, contaDestino, valor);
        System.out.printf("Transferência realizada com taxa de R$%.2f%n", taxaValor);
    }
}
