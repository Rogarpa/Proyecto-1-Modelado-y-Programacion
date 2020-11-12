import java.util.*;

public class Pizza implements ElementoMenu{

    protected ElementoMenu[] listaHijos;

    public Pizza(){
        listaHijos = new ElementoMenu[10];
    }

    /**
    *Método para agregar elementos al menu.
    *@param h el elemento a gregar.
    */
    public void agregarHijo(ElementoMenu h){
    }

    /**
    *Metodo para eliminar elementos del Menu.
    *@param h el elemento a eliminar.
    */
    public void eliminaHIjo(ElementoMenu h){
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public Hoja buscaHoja(int indiceHojaABuscar){
        Hoja aux = null;
        for(ElementoMenu em: listaHijos){
            if(em != null) aux = em.buscaHoja(indiceHojaABuscar);
            if(aux != null){
                System.out.println("Encontrado en pizza");
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
        if(elem != null)aux2=elem.rangoHojas();

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
