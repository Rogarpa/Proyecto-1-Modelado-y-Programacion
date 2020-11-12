import java.util.*;

public class Burrito implements ElementoMenu{

    protected Hashtable<Integer,ElementoMenu> listaHijos;

    public Burrito(){
        listaHijos = new Hashtable<>();
    }


    /**
    *Metodo para agregar elementos a la hashtable.
    *@param h el elemento a agregar.
    */
    public void agregarHijo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Hoja buscaHoja(int indiceHojaABuscar){
        Hoja aux;
        for(ElementoMenu em: listaHijos.values()){
            aux = em.buscaHoja(indiceHojaABuscar);
            if(aux != null) return (Hoja)listaHijos.get(aux);
            
        }
    return null;    
    }

    @Override
    public LinkedList<Integer> rangoHojas(){
    int min=1;
    int max=1;
    Collection<ElementoMenu> col=listaHijos.values();
    LinkedList<Integer> aux=new LinkedList<>();
    LinkedList<Integer> aux2=new LinkedList<>();
    for(ElementoMenu elem:col){
        aux2=elem.rangoHojas();
        for(Integer elem2:aux2){
            if(elem2>max){
                max=elem2;
            }else if(elem2<min){
                min=elem2;
            }
        }
    }
    aux.add(min);
    aux.add(max);
    return aux;
    }
}
