import java.util.Iterator;
import java.util.ArrayList;

public class MenuItem extends MenuComponent {
    String nombre;
    String descriction;
    double precio;

    public MenuItem(String nombre,
                    String descripcion,
                    double precio)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.price = precio;
    }

    public String getName() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return price;
    }

    public void print() {
        System.out.print("  " + getName());
        System.out.println(", " + getPrecio());
        System.out.println("     -- " + getDescripcion());
    }
}
