import java.util.LinkedList;

public class Nodo implements ElementoMenu{
    protected LinkedList<ElementoMenu> hijos;

    public Nodo(){
        hijos = new LinkedList<>();
    }

    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }
    public Hoja buscaHoja(int indiceHojaABuscar){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}
