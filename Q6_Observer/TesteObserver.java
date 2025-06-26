// Cenário: Em um sistema de monitoramento ambiental, sensores publicam dados em tempo real e diversos subsistemas 
// (visualização, alarme, registro) precisam ser notificados.

// Questão 6-A) Modele e implemente um sistema baseado em Observer.

package Q6_Observer;
public class TesteObserver {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        Observador alarme = new Alarme();
        Observador registro = new SistemaDeRegistro();
        Observador dashboard = new Dashboard();

        sensor.registrarObservador(alarme);
        sensor.registrarObservador(registro);
        sensor.registrarObservador(dashboard);

        sensor.novoDado("35°C");
        sensor.novoDado("40°C");
    }
}
