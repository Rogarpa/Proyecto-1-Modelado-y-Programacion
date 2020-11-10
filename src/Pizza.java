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

    @Override
    public String toString(){
        return "";
    }
<<<<<<< HEAD

    @Override
    public void buscaHoja(){
=======
    public Hoja buscaHoja(){
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
}
