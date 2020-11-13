import java.util.Iterator;

public class Burrito extends Iterable<Producto>{

    protected Producto[] listaHijos;

    public Burrito(){
        listaHijos = new ElementoMenu[10];
        listaHijos1.add(new MenuItem(1,"BURRITO DE QUESO","Burrito con relleno de queso", false, 90.00, TipoProducto.burrito));
        listaHijos2.add(new MenuItem(2,"URRITO VEGANO","Pizza solo de vegetales", true, 100.00, TipoProducto.burrito));
        listaHijos3.add(new MenuItem(3,"BURRITO DE CARNE","Burrito con exclusivamente de carne", false, 120.00, TipoProducto.burrito));
        listaHijos4.add(new MenuItem(4,"BURRITO CLASICO","Burrito sencillo", false, 70.00, TipoProducto.burrito));
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
    }
        ElementoMenu.add(listaHijos0);
        ElementoMenu.add(listaHijos1);
        ElementoMenu.add(listaHijos2);
        ElementoMenu.add(listaHijos3);

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "listaHijo0"+"/n" + "listaHijo1"+"/n" + "ListaHijo2" + "/n" + "ListaHijo3";
    }

    @Override
    public Iterator<Producto> iterator(){return listaHijos.asList().iterator();}

}
