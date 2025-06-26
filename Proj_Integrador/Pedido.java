
package Proj_Integrador;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private String status;
    private List<PedidoObserver> observers = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void notificarObservers() {
        for (PedidoObserver observer : observers) {
            observer.atualizar(this);
        }
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }
}
