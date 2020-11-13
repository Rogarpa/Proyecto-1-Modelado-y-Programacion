import java.util.LinkedList;

public class Pizza implements ElementoMenu{

    protected ElementoMenu[] listaHijos;

    public Pizza(){
        listaHijos0 = new ElementoMenu[]("PIZZA DE QUESO","Pizza solo de queso", False, 90, "");
        listaHijos1 = new ElementoMenu[]("PIZZA VEGANA","Pizza solo de vegetales", False, 100, "");
        listaHijos2 = new ElementoMenu[]("PIZZA DE DON CANGREJO","La mejor para ti y para mi, es la mejor ", True , 120, "");
        listaHijos3 = new ElementoMenu[]("PIZZA CLASICA","Pizza solo de queso y peperoni", False, 80, "");
    }

    public void agregarHijo(ElementoMenu h){
        listaHijos0.add(ListaHijos0);
        listaHijos1.add(ListaHijos1);
        listaHijos2.add(ListaHijos2);
        listaHijos3.add(ListaHijos3);
        
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return  "listaHijo0"+"/n" + "listaHijo1"+"/n" + "ListaHijo2" + "/n" + "ListaHijo3";
        
    }

    @Override
    public Hoja buscaHoja(){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}
