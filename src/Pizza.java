import java.util.Iterator;

public class Pizza extends Iterable<Producto>{

    protected Producto[] listaHijos;

    public Pizza(){
        listaHijos = new ElementoMenu[10];
        listaHijos 
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Iterator<Producto> iterator(){return listaHijos.asList().iterator();}
    
}
