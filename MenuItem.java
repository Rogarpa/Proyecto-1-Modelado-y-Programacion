import java.util.Iterator;
import java.util.ArrayList;

public class MenuItem extends MenuComponent {
    String nombre;
    String descriction;
    double precio;
    /**
    *Constructor de la clase.
    *@param nombre el nombre del item.
    *@param descripcion la descriction del item.
    *@param precio el precio del item.
    */
    public MenuItem(String nombre,
                    String descripcion,
                    double precio)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.price = precio;
    }

    /**
    *Metodo para acceder al nombre del item.
    *@return el nombre del item.
    */
    public String getName() {
        return nombre;
    }

    /**
    *Metodo para acceder a la descrpción del item.
    *@return la descrpción del item.
    */
    public String getDescripcion() {
        return descripcion;
    }

    /**
    *Metodo para acceder al precio del item.
    *@return el precio del item.
    */
    public double getPrecio() {
        return price;
    }

    /**
    *Metodo que imprime una descritpción detallada del item.
    */
    public void print() {
        System.out.print("  " + getName());
        System.out.println(", " + getPrecio());
        System.out.println("     -- " + getDescripcion());
    }
}
