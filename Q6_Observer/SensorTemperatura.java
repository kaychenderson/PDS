// Cenário: Em um sistema de monitoramento ambiental, sensores publicam dados em tempo real e diversos subsistemas 
// (visualização, alarme, registro) precisam ser notificados.

// Questão 6-A) Modele e implemente um sistema baseado em Observer.

package Q6_Observer;
import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements SensorObservado {
    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void registrarObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificarObservadores(String dado) {
        for (Observador obs : observadores) {
            obs.atualizar(dado);
        }
    }

    public void novoDado(String dado) {
        System.out.println("[Sensor] Novo dado: " + dado);
        notificarObservadores(dado);
    }
}
