package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Queso extends ComplementoDecorator {
    public Queso(IPizza wrappedPizza) {
        super(wrappedPizza);
        this.description = this.wrappedPizza.getDescription() + " + Queso";
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 0.50 + this.wrappedPizza.getCost();
    }
}