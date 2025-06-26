// Cenário: Em um sistema de monitoramento ambiental, sensores publicam dados em tempo real e diversos subsistemas 
// (visualização, alarme, registro) precisam ser notificados.

// Questão 6-A) Modele e implemente um sistema baseado em Observer.

package Q6_Observer;
public interface SensorObservado {
    void registrarObservador(Observador obs);
    void removerObservador(Observador obs);
    void notificarObservadores(String dado);
}
