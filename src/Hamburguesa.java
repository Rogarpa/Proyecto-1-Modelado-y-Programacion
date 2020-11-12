import java.util.LinkedList;

public class Hamburguesa implements ElementoMenu{

    protected LinkedList<ElementoMenu> listaHijos;

    public Hamburguesa(){
        listaHijos hijo0 = new LinkedList<>("HAMBURGUESA DE QUESO","Hamburguesa solo de queso", False, 90, "");
        listaHijos hijo1 = new LinkedList<>("HAMBURGUESA PICANTE","Hamburguesa con salsa y jalapeños", False, 100, "");
        listaHijos hijo2 = new LinkedList<>("HAMBURGUESA CON TOCINO","Hamburguesa con Tocino y queso", False, 120, "");
        listaHijos hijo3 = new LinkedList<>("HAMBURGUESA VEGANA ","Hamburguesa sin carne exclusivamente vegetales ", True, 110, "");
        listaHijos hijo4 = new LinkedList<>("KANGREBURGER ","Hamburguesa clasica", False, 105, "");
        //llenadoMenu
    }
    
    public void agregarHijo(ElementoMenu h){
        listaHijos.add(hijo0);
        listaHijos.add(hijo1);
        listaHijos.add(hijo2);
        listaHijos.add(hijo3);
        listaHijos.add(hijo4);
    }

    public void eliminaHIjo(ElementoMenu h){
        listaHijos.remove(h);
    }

    @Override
    public String toString(){
        return hijo0"\n" + hijo1"\n"  + hijo2"\n" + hijo3"\n"  + hijo4"\n";
    }

    @Override
    public Hoja buscaHoja(){

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
    int min=0;
    int max=4;
    for(ElementoMenu elem:listaHijos){
        getIndexof(elem);
    }
    return null;
    }
}
