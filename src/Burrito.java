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

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    public String toString(){
        return "";
    }
    public Hoja buscaHoja(){

    }
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}