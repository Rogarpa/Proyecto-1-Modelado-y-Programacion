import java.util.LinkedList;

public class Pizza implements ElementoMenu{

    protected ElementoMenu[] listaHijos;

    public Pizza(){
        listaHijos = new ElementoMenu[]();
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