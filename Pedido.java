// Pedido: classe observada
import java.util.List;
import java.util.ArrayList;


public class Pedido {
    private List<Observer> observadores = new ArrayList<>();
    private String status;
    private HamburguerPrototype hamburguer;

    public Pedido(HamburguerPrototype prototipo) {
        this.hamburguer = prototipo.clone();
        this.status = "Recebido";
    }

    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    public void mudarStatus(String novoStatus) {
        this.status = novoStatus;
        notificar();
    }

    private void notificar() {
        for (Observer o : observadores) {
            o.update(status);
        }
    }

    public void exibirPedido() {
        System.out.println("-----------------------------");
        System.out.println("Status do pedido: " + status);
        hamburguer.mostrarIngredientes();
        System.out.println("-----------------------------\n");
    }
}
