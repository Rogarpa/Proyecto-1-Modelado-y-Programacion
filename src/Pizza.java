import java.util.Iterator;

public class Pizza extends Iterable<Producto>{

    protected Producto[] listaHijos;

    public Pizza(){
        listaHijos = new ElementoMenu[10];
        listaHijos.add(new MenuItem(1,"PIZZA DE QUESO","Pizza solo de queso", false, 90.00, TipoProducto.pizza));
        listaHijos.add(new MenuItem(2,"PIZZA VEGANA","Pizza solo de vegetales", true, 100.00, TipoProducto.pizza));
        listaHijos.add(new MenuItem(3,"PIZZA DE DON CANGREJO","La mejor para ti y para mi, es la mejor", false, 120.00, TipoProducto.pizza));
        listaHijos.add(new MenuItem(4,"PIZZA CLASICA","Pizza solo de queso y peperoni", false, 80.00, TipoProducto.pizza));
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
