import java.util.LinkedList;

public class Nodo implements ElementoMenu{
    LinkedList<ElementoMenu> hijos;

    public Nodo(){
        hijos = new LinkedList<>();
    }

    public void agregarHijo(ElementoMenu h){
        hijos.add(h);
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
