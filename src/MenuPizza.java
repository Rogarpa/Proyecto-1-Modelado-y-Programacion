import java.util.Arrays;
import java.util.Iterator;

public class MenuPizza implements Iterable<Producto>{

    protected Producto[] listaHijos;

    public MenuPizza(){
        listaHijos = new Producto[10];
        
    }

    @Override
    public Iterator<Producto> iterator(){return Arrays.stream(listaHijos).iterator();}
    
}
