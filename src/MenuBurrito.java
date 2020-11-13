import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class MenuBurrito implements Iterable{

    private IteradorBurrito implements Iterator<Producto>{
        Iterator llaves;
        
        public IteradorBurrito(){
            llaves =  listaHijos.values();
        }
        
        @Override public boolean hasNext(){return llaves.hasNext();}
        @Override public Producto next(){return listaHijos.get(llaves.next());}
    }
    
    protectedHashtablee<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos = new Hashtable<>();
    }


    /**
    *Metodo para agregar elementos a la hashtable.
    *@param h el elemento a agregar.
    */
    public void agregarHijo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "";
    }
    @Override
    public Iterator iterator(){return new IteradorBurrito();}
}
