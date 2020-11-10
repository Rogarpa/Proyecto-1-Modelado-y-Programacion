import java.util.LinkedList;

public class Hamburguesa implements ElementoMenu{

    protected LinkedList<ElementoMenu> listaHijos;

    public Hamburguesa(){
        listaHijos = new LinkedList<>();
        //llenadoMenu
    }

    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
<<<<<<< HEAD
=======
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }
    public Hoja buscaHoja(){

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
