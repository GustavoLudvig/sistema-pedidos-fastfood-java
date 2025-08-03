// Classe concreta do hambúrguer CheddarBurger
import java.util.List;
import java.util.ArrayList;

public class CheddarBurger implements HamburguerPrototype {
    protected List<String> ingredientes;

    public CheddarBurger() {
        ingredientes = new ArrayList<>();
        ingredientes.add("Pão");
        ingredientes.add("Carne");
        ingredientes.add("Queijo Cheddar");
        ingredientes.add("Bacon");
    }

    @Override
    public HamburguerPrototype clone() {
        CheddarBurger clone = new CheddarBurger();
        clone.ingredientes = new ArrayList<>(this.ingredientes);
        return clone;
    }

    @Override
    public void mostrarIngredientes() {
        System.out.println("CheddarBurger com: " + ingredientes);
    }
}