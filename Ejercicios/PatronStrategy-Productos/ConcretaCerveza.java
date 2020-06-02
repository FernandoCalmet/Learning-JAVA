import java.util.*;

public class ConcretaCerveza implements IProductoCerveza {

    private List<String> producto = new ArrayList<String>();

    public List<String> getNegra() {
        this.producto.add("Stella Aris");
        this.producto.add("Malta Polar");
        this.producto.add("Cuzquena");
        return this.producto;
    }

    public List<String> getRubia() {
        this.producto.add("Corona");
        this.producto.add("Heineken");
        this.producto.add("Pilsen");
        return this.producto;
    }

    public List<String> getRoja() {
        this.producto.add("Red Luger");
        this.producto.add("Blue Moon");
        this.producto.add("Pilsen");
        this.producto.add("Callao");
        return this.producto;
    }
}