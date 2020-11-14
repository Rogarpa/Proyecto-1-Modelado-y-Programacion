import java.util.Arrays;
import java.util.Iterator;

public class MenuPizza implements Iterable<Producto>{

    protected Producto[] listaHijos;

    public MenuPizza(){
        listaHijos = new Producto[10];
        listaHijos[6] = (new MenuItem(6,"PIZZA DE QUESO","Pizza solo de queso", false, 90.00, TipoProducto.pizza));
        listaHijos[7] = (new MenuItem(7,"PIZZA VEGANA","Pizza solo de vegetales", true, 100.00, TipoProducto.pizza));
        listaHijos[8] = (new MenuItem(8,"PIZZA DE DON CANGREJO","La mejor para ti y para mi, es la mejor", false, 120.00, TipoProducto.pizza));
        listaHijos[9] = (new MenuItem(9,"PIZZA CLASICA","Pizza solo de queso y peperoni", false, 80.00, TipoProducto.pizza));        
    }

    @Override
    public Iterator<Producto> iterator(){return Arrays.stream(listaHijos).iterator();}
    
}
