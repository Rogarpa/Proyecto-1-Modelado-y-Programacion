import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class MenuBurrito implements Iterable<Producto>{

    private class IteradorBurrito implements Iterator<Producto>{
        Iterator<Producto> llaves;
        
        public IteradorBurrito(){
            llaves =  listaHijos.values().iterator();
        }
        
        @Override public boolean hasNext(){return llaves.hasNext();}
        @Override public Producto next(){return listaHijos.get(llaves.next());}
    }
    
    protected Hashtable<Integer, Producto> listaHijos;

    public MenuBurrito(){
        listaHijos = new Hashtable<>();
    }


    /**
    *Metodo para agregar elementos a la hashtable.
    *@param h el elemento a agregar.
    */
    public void agregarHijo(Producto h){
    }

    @Override
    public String toString(){
        return "";
    }
    @Override
    public Iterator iterator(){return new IteradorBurrito();}
}
