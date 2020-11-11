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

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Hoja buscaHoja(int indiceHojaABuscar){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
    /**int min=0;
    int max=0;
    for(ElementoMenu elem:listaHijos){
        getIndexof(elem);
    }*/
    return null;
    }
}
