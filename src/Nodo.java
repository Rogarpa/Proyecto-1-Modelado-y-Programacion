import java.util.LinkedList;

public class Nodo implements ElementoMenu{
    LinkedList<ElementoMenu> hijos;

    public Nodo(){
        hijos = new LinkedList<>();
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