import java.util.*;

public class Nodo implements ElementoMenu{
    protected LinkedList<ElementoMenu> listaHijos;

    public Nodo(){
        listaHijos = new LinkedList<>();
    }

    /**
    *Metodo para agregar elementos a la estructura..
    *@param h el elemento a agregar.
    */
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
    }

    /**
    *Metodo para eliminar elementos de la estructura.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }
    public Producto buscaHoja(int indiceHojaABuscar){
        Producto aux;
        for(ElementoMenu em: listaHijos){
            aux = em.buscaHoja(indiceHojaABuscar);
            if(aux != null){
                System.out.println("Encontrado en nodo");
                return aux;
            }
        }
    return null;
    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        int max=1;
        int min=1;
        LinkedList<Integer> aux=new LinkedList<>();
        LinkedList<Integer> aux2=new LinkedList<>();
        for(ElementoMenu elem:listaHijos){
            aux2=elem.rangoHojas();
            for (Integer elem2:aux2){
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
