import java.util.Iterator;

public class Burrito extends Iterable<Producto>{

    protected Producto[] listaHijos;

    public Burrito(){
        listaHijos = new ElementoMenu[10];
        listaHijos.add(new MenuItem(1,"BURRITO DE QUESO","Burrito con relleno de queso", false, 90.00, TipoProducto.burrito));
        listaHijos.add(new MenuItem(2,"URRITO VEGANO","Pizza solo de vegetales", true, 100.00, TipoProducto.burrito));
        listaHijos.add(new MenuItem(3,"BURRITO DE CARNE","Burrito con exclusivamente de carne", false, 120.00, TipoProducto.burrito));
        listaHijos.add(new MenuItem(4,"BURRITO CLASICO","Burrito sencillo", false, 70.00, TipoProducto.burrito));
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
