import java.util.Hashtable;
import java.util.LinkedList;

public class Burrito implements ElementoMenu{

    protected Hastable<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos = new Hashtable<>();
    }


    
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public void buscaHoja(){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}
