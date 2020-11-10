import java.util.LinkedList;

public class Hamburguesa implements ElementoMenu{

    LinkedList<ElementoMenu> listaHijos;

    public Hamburguesa(){
        listaHijos = new LinkedList<>();
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