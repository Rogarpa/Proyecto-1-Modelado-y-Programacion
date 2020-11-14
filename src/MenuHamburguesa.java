import java.util.LinkedList;
import java.util.Iterator;

public class MenuHamburguesa implements Iterable<Producto>{

    protected LinkedList<Producto> listaHijos;

    public MenuHamburguesa(){
        listaHijos = new LinkedList<>();
        listaHijos.add(new MenuItem(1,"HAMBURGUESA DE QUESO","Hamburguesa solo de queso", false, 90.00, TipoProducto.hamburguesa));
        listaHijos.add(new MenuItem(2,"HAMBURGUESA PICANTE","Hamburguesa con salsa y jalapeño", false, 100.00, TipoProducto.hamburguesa));
        listaHijos.add(new MenuItem(3,"HAMBURGUESA CON TOCINO","Hamburguesa con Tocino y queso", false, 120.00, TipoProducto.hamburguesa));
        listaHijos.add(new MenuItem(4,"HAMBURGUESA VEGANA","Hamburguesa sin carne exclusivamente vegetales", true, 110.00, TipoProducto.hamburguesa));
        listaHijos.add(new MenuItem(5,"KANGREBURGER","Hamburguesa clasica", false, 105.00, TipoProducto.hamburguesa));
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(Producto h){
        listaHijos.add(h);
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(Producto h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }

    @Override     
    public Iterator<Producto> iterator(){return (listaHijos.iterator());}
}
