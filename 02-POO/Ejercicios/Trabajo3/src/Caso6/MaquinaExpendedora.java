package Caso6;

import java.util.ArrayList;

/**
 *
 * @author fernandocalmet
 */
public class MaquinaExpendedora 
{
    private int numero;
    private String nombre;
    private ArrayList<Producto> productos;
    private double totalDinero;

    public MaquinaExpendedora(int numero, String nombre, ArrayList<Producto> productos) {
        this.numero = numero;
        this.nombre = nombre;
        this.productos = productos;
        this.totalDinero = 0;
    }
    
    public void comprarProducto(Producto producto, int cantidad, double precio)
    {
        if(producto.getStock() > 0){
            if(producto.getPrecio() <= precio){
                producto.restarStock(cantidad);
                this.totalDinero =+ precio;
            }else{
                System.out.println("El precio no es suficiente para comprar esta cantidad del producto.");
            }                      
        }
        else{
            System.out.println("El stock del producto esta vacio.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(double totalDinero) {
        this.totalDinero = totalDinero;
    }
    
    @Override
    public String toString()
    {
        return "Maquina Expendedora Nro."+getNumero()+"\nNombre: "+getNombre()+"\nTotal de dinero: "+getTotalDinero()+"\nProductos: "+getProductos();
    }
}
