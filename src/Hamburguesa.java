import java.util.LinkedList;

public class Hamburguesa implements ElementoMenu{

    protected LinkedList<ElementoMenu> listaHijos;

    public Hamburguesa(){
        listaHijos = new LinkedList<>();
        //llenadoMenu
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