// Observador: Tela de Cozinha
public class TelaCozinha implements Observer {
    private String nome;

    public TelaCozinha(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String novoStatus) {
        System.out.println("[" + nome + "] Pedido atualizado para: " + novoStatus);
    }
}
