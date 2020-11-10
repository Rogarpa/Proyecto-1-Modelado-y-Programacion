import java.util.LinkedList;

public class Pizza implements ElementoMenu{

    ElementoMenu[] listaHijos;

    public Pizza(){
        listaHijos = new ElementoMenu[]();
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
