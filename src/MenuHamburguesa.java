import java.util.Iterab;

public class MenuHamburguesa extends Iterable<Producto>{

    protected LinkedList<ElementoMenu> listaHijos;

    public MenuHamburguesa(){
        listaHijos = new LinkedList<>();
        //llenadoMenu
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }

    @Override     
    public Iterator<Producto> iterator(){return listaHijos.iterator();}
}
