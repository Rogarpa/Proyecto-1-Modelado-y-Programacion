import java.util.*;

public class Hamburguesa implements ElementoMenu{

    protected LinkedList<ElementoMenu> listaHijos;

    public Hamburguesa(){
        listaHijos = new LinkedList<>();
        //llenadoMenu
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(h);
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Hoja buscaHoja(int indiceHojaABuscar){
        Hoja aux;
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
    int min=1;
    int max=1;
    LinkedList<Integer> aux=new LinkedList<>();
    LinkedList<Integer> aux2=new LinkedList<>();
    for(ElementoMenu elem:listaHijos){
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
