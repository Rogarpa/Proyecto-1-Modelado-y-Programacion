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
        listaHijos.add(listaHijos0);
        listaHijos.add(listaHijos1);
        listaHijos.add(listaHijos2);
        listaHijos.add(listaHijos3);
        
    }

    @Override
    public String toString(){
        return "listaHijos0"+"/n" + "listaHijos1"+"/n" + "listaHijos2"+ "/n" + "listaHijos3"+"/n";
    }

    @Override
    public void buscaHoja(){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}

      
