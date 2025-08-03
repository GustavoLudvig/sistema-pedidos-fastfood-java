// Classe concreta do hambúrguer VeggieBurger
import java.util.List;
import java.util.ArrayList;

public class VeggieBurger implements HamburguerPrototype {
    protected List<String> ingredientes;

    public VeggieBurger() {
        ingredientes = new ArrayList<>();
        ingredientes.add("Pão Integral");
        ingredientes.add("Hambúrguer de Grão de Bico");
        ingredientes.add("Tomate");
        ingredientes.add("Alface");
        ingredientes.add("Molho Vegan");
    }

    @Override
    public HamburguerPrototype clone() {
        VeggieBurger clone = new VeggieBurger();
        clone.ingredientes = new ArrayList<>(this.ingredientes);
        return clone;
    }

    @Override
    public void mostrarIngredientes() {
        System.out.println("VeggieBurger com: " + ingredientes);
    }
}
