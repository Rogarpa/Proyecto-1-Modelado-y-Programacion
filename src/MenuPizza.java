import java.util.Arrays;
import java.util.Iterator;

public class MenuPizza implements Iterable<Producto>{

    protected Producto[] listaHijos;

    public MenuPizza(){
        listaHijos = new Producto[10];
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(Producto h){
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(Producto h){
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Iterator<Producto> iterator(){return Arrays.stream(listaHijos).iterator();}
    
}
