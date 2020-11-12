import java.util.Hashtable;
import java.util.LinkedList;

public class Burrito implements ElementoMenu{

    protected Hastable<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos0 = new Hashtable<>("BURRITO DE QUESO" ,"Burrito con relleno de queso" , False , 90 ,"");
        listaHijos1 = new Hashtable<>("BURRITO DE CARNE" ,"Burrito con exclusivamente de carne" , False , 120 ,"");
        listaHijos2 = new Hashtable<>("BURRITO VEGANO" ,"Burrito excluisivo de vegetales" , True , 80 ,"");
        listaHijos3 = new Hashtable<>("BURRITO CLASICO" ,"Burrito sencillo" , True , 70 ,"");
    
    public void agregarHijo(ElementoMenu h){
        listaHijos1.add(hijos0);
        listaHijos1.add(hijos1);
        listaHijos1.add(hijos2);
        listaHijos1.add(hijos3);
        
    }

    @Override
    public String toString(){
        return "hijo0"\n" + hijo1"\n"  + hijo2"\n" + hijo3"\n";
    }

    @Override
    public void buscaHoja(){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}

      
