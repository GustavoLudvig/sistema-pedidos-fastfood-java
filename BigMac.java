import java.util.ArrayList;
import java.util.List;

public class BigMac implements HamburguerPrototype {
    protected List<String> ingredientes;

    public BigMac() {
        ingredientes = new ArrayList<>();
        ingredientes.add("Pão");
        ingredientes.add("Carne");
        ingredientes.add("Alface");
        ingredientes.add("Molho especial");
    }

    @Override
    public HamburguerPrototype clone() {
        BigMac clone = new BigMac();
        clone.ingredientes = new ArrayList<>(this.ingredientes);
        return clone;
    }

    @Override
    public void mostrarIngredientes() {
        System.out.println("BigMac com: " + ingredientes);
    }
}