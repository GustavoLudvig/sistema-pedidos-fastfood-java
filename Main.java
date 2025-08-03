public class Main {
    public static void main(String[] args) {
        HamburguerPrototype bigMacPrototype = new BigMac();
        HamburguerPrototype cheddarPrototype = new CheddarBurger();
        HamburguerPrototype veggiePrototype = new VeggieBurger();

        Pedido pedido1 = new Pedido(bigMacPrototype);
        Pedido pedido2 = new Pedido(cheddarPrototype);
        Pedido pedido3 = new Pedido(veggiePrototype);

        TelaCozinha cozinha = new TelaCozinha("Cozinha Principal");
        TelaCozinha cliente = new TelaCozinha("Painel do Cliente");

        pedido1.adicionarObservador(cozinha);
        pedido1.adicionarObservador(cliente);

        pedido2.adicionarObservador(cozinha);
        pedido3.adicionarObservador(cozinha);
        pedido3.adicionarObservador(cliente);

        System.out.println("===== PEDIDO 1 =====");
        pedido1.exibirPedido();
        pedido1.mudarStatus("Em preparo");
        pedido1.mudarStatus("Finalizado");

        System.out.println("===== PEDIDO 2 =====");
        pedido2.exibirPedido();
        pedido2.mudarStatus("Em preparo");
        pedido2.mudarStatus("Entregue");

        System.out.println("===== PEDIDO 3 =====");
        pedido3.exibirPedido();
        pedido3.mudarStatus("Montando Veggie");
        pedido3.mudarStatus("Pronto para retirada");
    }
}
