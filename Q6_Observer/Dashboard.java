// Cenário: Em um sistema de monitoramento ambiental, sensores publicam dados em tempo real e diversos subsistemas 
// (visualização, alarme, registro) precisam ser notificados.

// Questão 6-A) Modele e implemente um sistema baseado em Observer.

package Q6_Observer;
public class Dashboard implements Observador {
    @Override
    public void atualizar(String dado) {
        System.out.println("[Dashboard] Atualizando interface com: " + dado);
    }
}
