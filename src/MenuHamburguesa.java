import java.util.LinkedList;
import java.util.Iterator;

public class MenuHamburguesa implements Iterable<Producto>{

    protected LinkedList<Producto> listaHijos;

    public MenuHamburguesa(){
        listaHijos = new LinkedList<>();
        //llenadoMenu
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
