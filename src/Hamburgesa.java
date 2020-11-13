import java.util.Iterator;

public class Hamburgesa extends Iterable<Producto>{

    protected Producto[] listaHijos;

    public Hamburgesa(){
        listaHijos = new ElementoMenu[10];
        listaHijos1.add(new MenuItem(1,"HAMBURGUESA DE QUESO","Hamburguesa solo de queso", false, 90.00, TipoProducto.hamburguesa));
        listaHijos2.add(new MenuItem(2,"HAMBURGUESA PICANTE","Hamburguesa con salsa y jalapeño", false, 100.00, TipoProducto.hamburguesa));
        listaHijos3.add(new MenuItem(3,"HAMBURGUESA CON TOCINO","Hamburguesa con Tocino y queso", false, 120.00, TipoProducto.hamburguesa));
        listaHijos4.add(new MenuItem(4,"HAMBURGUESA VEGANA","Hamburguesa sin carne exclusivamente vegetales", true, 110.00, TipoProducto.hamburguesa));
        listaHijos5.add(new MenuItem(5,"KANGREBURGER","Hamburguesa clasica", false, 105.00, TipoProducto.hamburguesa));
    }
    //llenadoMenu
    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
        ElementoMenu.add(listaHijos1);
        ElementoMenu.add(listaHijos2);
        ElementoMenu.add(listaHijos3);
        ElementoMenu.add(listaHijos4);
        ElementoMenu.add(listaHijos5);
       
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "listaHijo0"+"/n" + "listaHijo1"+"/n" + "ListaHijo2" + "/n" + "ListaHijo3";;
    }

    @Override
    public Iterator<Producto> iterator(){return listaHijos.asList().iterator();}

}
