import java.util.Hashtable;
import java.util.LinkedList;

public class Burrito implements ElementoMenu{

    Hastable<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos = new Hashtable<>();
    }

    public void agregarHijo(ElementoMenu h){
        hijos.add(h);
    }

    public String toString(){
        return "";
    }
    public void buscaHoja(){

    }
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}